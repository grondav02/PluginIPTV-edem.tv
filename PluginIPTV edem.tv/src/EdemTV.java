import com.niklabs.perfectplayer.plugin.PluginIPTV;

/**
 * PluginIPTV 'edem.tv' for the Perfect Player
 * @version 0.1.0
 */
public class EdemTV implements PluginIPTV {
	
	@Override
	public String getPluginName() {
		return "edem.tv";
	}

	@Override
	public String getConstantURL(String url) {
		if (url.toUpperCase().indexOf("EDEM.TV") != -1) {
			int pos1 = url.toUpperCase().indexOf("/IPTV/");
			int pos2 = -1;
			if (pos1 > 0 && url.length() > pos1 + 6) {
				pos2 = url.indexOf('/', pos1 + 6);
				if (pos2 > 0) url = url.substring(0, pos1 + 5) + url.substring(pos2);
			}
		}
		
		return url;
	}

}
