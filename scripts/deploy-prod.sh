echo "STARTING DEPLOY"
cd /home/crypto_post/backend/
rm -rf cs-backend
git clone git@bitbucket.org:ayo-scienta/cs-backend.git
cd cs-backend
git checkout dev
chmod +x ./gradlew
docker compose down
docker compose rm -f
./gradlew build && docker compose up --build -d
echo "END OF DEPLOY"
