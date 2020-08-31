//  MIT License
//  
//  Copyright (c) 2020 fren_gor
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

package com.fren_gor.commandCraftCore.reader.lines;

import org.apache.commons.lang3.Validate;

import com.fren_gor.commandCraftCore.reader.Reader;

import lombok.Getter;

public class GotoLine extends Line {

	@Getter
	private int gotoLine;

	public void setGotoLine(int gotoLine) {
		Validate.isTrue(gotoLine > 0, "Goto line must be positive");
		this.gotoLine = gotoLine;
	}

	public GotoLine(Reader reader, int line) {
		super(reader, line);
	}

	@Override
	public LineType getType() {
		return LineType.GOTO;
	}

	@Override
	public String toString() {
		return String.valueOf(gotoLine);
	}

}