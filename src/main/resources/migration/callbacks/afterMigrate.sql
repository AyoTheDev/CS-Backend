DO
$$
    DECLARE
        t record;
    BEGIN
        -- TABLES
        FOR t IN
            SELECT table_name
            FROM information_schema.tables
            WHERE table_schema = 'public'
              AND table_name <> 'flyway_schema_history'
            LOOP
                EXECUTE format('GRANT SELECT, INSERT, UPDATE, DELETE ON TABLE %I TO ${application_user};', t.table_name);
                EXECUTE format('GRANT REFERENCES ON TABLE %I TO ${application_user};', t.table_name);
            END LOOP;
        -- SEQUENCES
        FOR t IN
            SELECT sequence_name
            FROM information_schema.sequences
            WHERE sequence_schema = 'public'
            LOOP
                EXECUTE format('GRANT USAGE ON SEQUENCE %I TO ${application_user};', t.sequence_name);
                EXECUTE format('GRANT SELECT ON SEQUENCE %I TO ${application_user};', t.sequence_name);
            END LOOP;
    END;
$$ LANGUAGE plpgsql;