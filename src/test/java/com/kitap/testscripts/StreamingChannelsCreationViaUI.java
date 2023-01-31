package com.kitap.testscripts;
import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

/*
@KTV1296
@date: 22/08/2022
@Description: This page object covers the creation of Streaming channels Via UI
*/

public class StreamingChannelsCreationViaUI extends BaseTest {
    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
    public void StreamingChannelsCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("StreamingChannelsCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "StreamingChannelsCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);

        lightningloginpage.login(SFUserId, SFPassword);

        streamingchannelslistpage.clickninesymbol();

        streamingchannelslistpage.enterStreamingChannels("Search apps and items...", data.get("Data_searchbar"));

        streamingchannelslistpage.clickStreamingChannels();

        streamingchannelslistpage.Newbutton("New");

        streamingchannelslistpage.ChannelName("Streaming Channel Name",data.get("Streaming Channel Name"));

        streamingchannelslistpage.Description("Description",data.get("Description"));

        streamingchannelslistpage.clicksavebutton("Save");
    }
}
