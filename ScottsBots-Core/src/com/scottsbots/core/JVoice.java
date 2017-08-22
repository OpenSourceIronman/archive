/*
 * (C) Copyright 2000-2011, by Scott Preston and Preston Research LLC
 *
 *  Project Info:  http://www.scottsbots.com
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.scottsbots.core;

/**
 * Interface for the robot's voice.
 * @author scott
 */

public interface JVoice {

    /**
     * 
     * @param words - The words spoken by the voice implementation.
     */
	
    public void speak(String words);
    
    /**
     * Responsible for opening the connection to the voice subsystem
     * and allocating resources.
     */
    
    public void open();
    
    /**
     * Responsible for closing the connection to the voice subsystem
     * and deallocating resources. 
     */
    
    public void close();

}