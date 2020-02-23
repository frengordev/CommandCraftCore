//  MIT License
//  
//  Copyright (c) 2019 fren_gor
//  
//  Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files (the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions:
//  
//  The above copyright notice and this permission notice shall be included in all
//  copies or substantial portions of the Software.
//  
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//  SOFTWARE.

package com.fren_gor.commandCraftCore;

import java.util.LinkedList;
import java.util.List;

import lombok.Getter;

public class ConfigManager {

	static boolean debugMode = false;
	static boolean viewExecutingTime = false;
	static boolean viewReadingTime = false;
	static boolean ignoreLops = true;
	static boolean createFolders = false;
	@Getter
	static List<String> disabledScripts = new LinkedList<>();

	public static boolean isActiveViewReadingTime() {
		return viewReadingTime;
	}

	public static boolean isActiveViewExecutingTime() {
		return viewExecutingTime;
	}

	public static boolean isActiveDebugMode() {
		return debugMode;
	}

	public static boolean ignoreLoop() {
		return ignoreLops;
	}

	public static boolean createFolders() {
		return createFolders;
	}

	static void setDisabledScripts(List<String> l) {
		disabledScripts.clear();
		for (String s : l) {
			disabledScripts.add(s.endsWith(".cmc") ? s : s + ".cmc");
		}
	}

}
