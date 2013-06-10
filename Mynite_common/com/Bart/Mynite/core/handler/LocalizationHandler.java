package com.Bart.Mynite.core.handler;

import com.Bart.Mynite.core.helper.LocalizationHelper;
import com.Bart.Mynite.lib.Localizations;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler {
	public static void loadLanguages(){
		for(String LocationFile: Localizations.localeFiles){
			LanguageRegistry.instance().loadLocalization(LocationFile, LocalizationHelper.getLocaleFromFileName(LocationFile), LocalizationHelper.isXMLLanguageFile(LocationFile));
		}
	}
}
