/*******************************************************************************
 * Copyright (c) 2006 Mountainminds GmbH & Co. KG
 * This software is provided under the terms of the Eclipse Public License v1.0
 * See http://www.eclipse.org/legal/epl-v10.html.
 *
 * $Id$
 ******************************************************************************/
package com.mountainminds.eclemma.core;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.mountainminds.eclemma.internal.core.SessionManagerTest;
import com.mountainminds.eclemma.internal.core.analysis.CounterTest;
import com.mountainminds.eclemma.internal.core.analysis.JavaElementCoverageTest;
import com.mountainminds.eclemma.internal.core.analysis.LinesTest;
import com.mountainminds.eclemma.internal.core.analysis.TypeTraverserTest;

/**
 * Suite of all EclEmma core tests.
 * 
 * @author  Marc R. Hoffmann
 * @version $Revision$
 */
public class AllEclEmmaCoreTests {
  
  public static Test suite() {
    TestSuite suite = new TestSuite();

    // com.mountainminds.eclemma.core.*
    suite.addTestSuite(EclEmmaStatusTest.class);
    
    // com.mountainminds.eclemma.internal.core.*
    suite.addTestSuite(SessionManagerTest.class);
    
    // com.mountainminds.eclemma.internal.core.analysis.*
    suite.addTestSuite(CounterTest.class);
    suite.addTestSuite(JavaElementCoverageTest.class);
    suite.addTestSuite(TypeTraverserTest.class);
    suite.addTestSuite(LinesTest.class);
   
    return suite;
  }

}
