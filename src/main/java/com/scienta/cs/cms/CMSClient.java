package com.scienta.cs.cms;

import com.scienta.cs.cms.config.CMSConfiguration;
import com.scienta.cs.cms.models.CmsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "cms-client", url = "${feign.client.cms.url}", configuration = CMSConfiguration.class)
public interface CMSClient {

    @GetMapping("/setting")
    CmsResponse<SettingDto> getSettings();

}
