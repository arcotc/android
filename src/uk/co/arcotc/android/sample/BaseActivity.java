package uk.co.arcotc.android.sample;

import android.app.Activity;
import android.content.SharedPreferences;

public abstract class BaseActivity extends Activity {
	public static final String APP_PREFERENCES = "AppPrefs";
	
	public void savePreferences() {
		SharedPreferences settings = getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE);
		SharedPreferences.Editor prefEditor = settings.edit();
		prefEditor.putString("UserName", "JohnDoe");
		prefEditor.putInt("UserAge", 22);
		prefEditor.commit();
	}
	
	public String getStringPreference(String key, String defaultValue) {
		SharedPreferences settings = getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE);
		if (settings.contains(key)) {
			return settings.getString(key, defaultValue);
		}
		
		return defaultValue;
	}
	
	public Integer getIntegerPreference(String key, Integer defaultValue) {
		SharedPreferences settings = getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE);
		if (settings.contains(key)) {
			return settings.getInt(key, defaultValue);
		}
		
		return defaultValue;
	}
	
	public Long getLongPreference(String key, Long defaultValue) {
		SharedPreferences settings = getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE);
		if (settings.contains(key)) {
			return settings.getLong(key, defaultValue);
		}
		
		return defaultValue;
	}
	
	public Float getFloatPreference(String key, Float defaultValue) {
		SharedPreferences settings = getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE);
		if (settings.contains(key)) {
			return settings.getFloat(key, defaultValue);
		}
		
		return defaultValue;
	}
	
	public Boolean getBooleanPreference(String key, Boolean defaultValue) {
		SharedPreferences settings = getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE);
		if (settings.contains(key)) {
			return settings.getBoolean(key, defaultValue);
		}
		
		return defaultValue;
	}
}
