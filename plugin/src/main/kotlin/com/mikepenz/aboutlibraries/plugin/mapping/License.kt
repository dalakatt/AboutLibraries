package com.mikepenz.aboutlibraries.plugin.mapping

/**
 * LICENSE LIST THANKS TO: https://spdx.org/licenses/
 */
enum class License(val fullName: String, val id: String, val aboutLibsId: String? = null, val customMatcher: ((name: String, url: String) -> Boolean)? = null) {
    _0BSD("BSD Zero Clause License", "0BSD"),
    AAL("Attribution Assurance License", "AAL"),
    Abstyles("Abstyles License", "Abstyles"),
    Adobe_2006("Adobe Systems Incorporated Source Code License Agreement", "Adobe-2006"),
    Adobe_Glyph("Adobe Glyph List License", "Adobe-Glyph"),
    ADSL("Amazon Digital Services License", "ADSL"),
    AFL_1_1("Academic Free License v1.1", "AFL-1.1"),
    AFL_1_2("Academic Free License v1.2", "AFL-1.2"),
    AFL_2_0("Academic Free License v2.0", "AFL-2.0"),
    AFL_2_1("Academic Free License v2.1", "AFL-2.1"),
    AFL_3_0("Academic Free License v3.0", "AFL-3.0"),
    Afmparse("Afmparse License", "Afmparse"),
    AGPL_1_0_only("Affero General Public License v1.0 only", "AGPL-1.0-only"),
    AGPL_1_0_or_later("Affero General Public License v1.0 or later", "AGPL-1.0-or-later"),
    AGPL_3_0_only("GNU Affero General Public License v3.0 only", "AGPL-3.0-only"),
    AGPL_3_0_or_later("GNU Affero General Public License v3.0 or later", "AGPL-3.0-or-later"),
    Aladdin("Aladdin Free Public License", "Aladdin"),
    AMDPLPA("AMD's plpa_map.c License", "AMDPLPA"),
    AML("Apple MIT License", "AML"),
    AMPAS("Academy of Motion Picture Arts and Sciences BSD", "AMPAS"),
    ANTLR_PD("ANTLR Software Rights Notice", "ANTLR-PD"),
    Apache_1_0("Apache License 1.0", "Apache-1.0"),
    Apache_1_1("Apache License 1.1", "Apache-1.1"),
    APAFML("Adobe Postscript AFM License", "APAFML"),
    APL_1_0("Adaptive Public License 1.0", "APL-1.0"),
    APSL_1_0("Apple Public Source License 1.0", "APSL-1.0"),
    APSL_1_1("Apple Public Source License 1.1", "APSL-1.1"),
    APSL_1_2("Apple Public Source License 1.2", "APSL-1.2"),
    APSL_2_0("Apple Public Source License 2.0", "APSL-2.0"),
    Artistic_1_0("Artistic License 1.0", "Artistic-1.0"),
    Artistic_1_0_cl8("Artistic License 1.0 w/clause 8", "Artistic-1.0-cl8"),
    Artistic_1_0_Perl("Artistic License 1.0 (Perl)", "Artistic-1.0-Perl"),
    Artistic_2_0("Artistic License 2.0", "Artistic-2.0"),
    Bahyph("Bahyph License", "Bahyph"),
    Barr("Barr License", "Barr"),
    Beerware("Beerware License", "Beerware"),
    BitTorrent_1_0("BitTorrent Open Source License v1.0", "BitTorrent-1.0"),
    BitTorrent_1_1("BitTorrent Open Source License v1.1", "BitTorrent-1.1"),
    blessing("SQLite Blessing", "blessing"),
    BlueOak_1_0_0("Blue Oak Model License 1.0.0", "BlueOak-1.0.0"),
    Borceux("Borceux license", "Borceux"),
    BSD_1_Clause("BSD 1-Clause License", "BSD-1-Clause"),
    BSD_2_Clause("BSD 2-Clause \"Simplified\" License", "BSD-2-Clause"),
    BSD_2_Clause_FreeBSD("BSD 2-Clause FreeBSD License", "BSD-2-Clause-FreeBSD"),
    BSD_2_Clause_NetBSD("BSD 2-Clause NetBSD License", "BSD-2-Clause-NetBSD"),
    BSD_2_Clause_Patent("BSD-2-Clause Plus Patent License", "BSD-2-Clause-Patent"),
    BSD_3_Clause("BSD 3-Clause \"New\" or \"Revised\" License", "BSD-3-Clause"),
    BSD_3_Clause_Attribution("BSD with attribution", "BSD-3-Clause-Attribution"),
    BSD_3_Clause_Clear("BSD 3-Clause Clear License", "BSD-3-Clause-Clear"),
    BSD_3_Clause_LBNL("Lawrence Berkeley National Labs BSD variant license", "BSD-3-Clause-LBNL"),
    BSD_3_Clause_No_Nuclear_License("BSD 3-Clause No Nuclear License", "BSD-3-Clause-No-Nuclear-License"),
    BSD_3_Clause_No_Nuclear_License_2014("BSD 3-Clause No Nuclear License 2014", "BSD-3-Clause-No-Nuclear-License-2014"),
    BSD_3_Clause_No_Nuclear_Warranty("BSD 3-Clause No Nuclear Warranty", "BSD-3-Clause-No-Nuclear-Warranty"),
    BSD_3_Clause_Open_MPI("BSD 3-Clause Open MPI variant", "BSD-3-Clause-Open-MPI"),
    BSD_4_Clause("BSD 4-Clause \"Original\" or \"Old\" License", "BSD-4-Clause"),
    BSD_4_Clause_UC("BSD-4-Clause (University of California-Specific)", "BSD-4-Clause-UC"),
    BSD_Protection("BSD Protection License", "BSD-Protection"),
    BSD_Source_Code("BSD Source Code Attribution", "BSD-Source-Code"),
    BSL_1_0("Boost Software License 1.0", "BSL-1.0"),
    bzip2_1_0_5("bzip2 and libbzip2 License v1.0.5", "bzip2-1.0.5"),
    bzip2_1_0_6("bzip2 and libbzip2 License v1.0.6", "bzip2-1.0.6"),
    Caldera("Caldera License", "Caldera"),
    CATOSL_1_1("Computer Associates Trusted Open Source License 1.1", "CATOSL-1.1"),
    CC_BY_1_0("Creative Commons Attribution 1.0 Generic", "CC-BY-1.0"),
    CC_BY_2_0("Creative Commons Attribution 2.0 Generic", "CC-BY-2.0"),
    CC_BY_2_5("Creative Commons Attribution 2.5 Generic", "CC-BY-2.5"),
    CC_BY_3_0("Creative Commons Attribution 3.0 Unported", "CC-BY-3.0"),
    CC_BY_4_0("Creative Commons Attribution 4.0 International", "CC-BY-4.0"),
    CC_BY_NC_1_0("Creative Commons Attribution Non Commercial 1.0 Generic", "CC-BY-NC-1.0"),
    CC_BY_NC_2_0("Creative Commons Attribution Non Commercial 2.0 Generic", "CC-BY-NC-2.0"),
    CC_BY_NC_2_5("Creative Commons Attribution Non Commercial 2.5 Generic", "CC-BY-NC-2.5"),
    CC_BY_NC_3_0("Creative Commons Attribution Non Commercial 3.0 Unported", "CC-BY-NC-3.0"),
    CC_BY_NC_4_0("Creative Commons Attribution Non Commercial 4.0 International", "CC-BY-NC-4.0"),
    CC_BY_NC_ND_1_0("Creative Commons Attribution Non Commercial No Derivatives 1.0 Generic", "CC-BY-NC-ND-1.0"),
    CC_BY_NC_ND_2_0("Creative Commons Attribution Non Commercial No Derivatives 2.0 Generic", "CC-BY-NC-ND-2.0"),
    CC_BY_NC_ND_2_5("Creative Commons Attribution Non Commercial No Derivatives 2.5 Generic", "CC-BY-NC-ND-2.5"),
    CC_BY_NC_ND_3_0("Creative Commons Attribution Non Commercial No Derivatives 3.0 Unported", "CC-BY-NC-ND-3.0"),
    CC_BY_NC_ND_4_0("Creative Commons Attribution Non Commercial No Derivatives 4.0 International", "CC-BY-NC-ND-4.0"),
    CC_BY_NC_SA_1_0("Creative Commons Attribution Non Commercial Share Alike 1.0 Generic", "CC-BY-NC-SA-1.0"),
    CC_BY_NC_SA_2_0("Creative Commons Attribution Non Commercial Share Alike 2.0 Generic", "CC-BY-NC-SA-2.0"),
    CC_BY_NC_SA_2_5("Creative Commons Attribution Non Commercial Share Alike 2.5 Generic", "CC-BY-NC-SA-2.5"),
    CC_BY_NC_SA_3_0("Creative Commons Attribution Non Commercial Share Alike 3.0 Unported", "CC-BY-NC-SA-3.0"),
    CC_BY_NC_SA_4_0("Creative Commons Attribution Non Commercial Share Alike 4.0 International", "CC-BY-NC-SA-4.0"),
    CC_BY_ND_1_0("Creative Commons Attribution No Derivatives 1.0 Generic", "CC-BY-ND-1.0"),
    CC_BY_ND_2_0("Creative Commons Attribution No Derivatives 2.0 Generic", "CC-BY-ND-2.0"),
    CC_BY_ND_2_5("Creative Commons Attribution No Derivatives 2.5 Generic", "CC-BY-ND-2.5"),
    CC_BY_ND_3_0("Creative Commons Attribution No Derivatives 3.0 Unported", "CC-BY-ND-3.0"),
    CC_BY_ND_4_0("Creative Commons Attribution No Derivatives 4.0 International", "CC-BY-ND-4.0"),
    CC_BY_SA_1_0("Creative Commons Attribution Share Alike 1.0 Generic", "CC-BY-SA-1.0"),
    CC_BY_SA_2_0("Creative Commons Attribution Share Alike 2.0 Generic", "CC-BY-SA-2.0"),
    CC_BY_SA_2_5("Creative Commons Attribution Share Alike 2.5 Generic", "CC-BY-SA-2.5"),
    CC_BY_SA_3_0("Creative Commons Attribution Share Alike 3.0 Unported", "CC-BY-SA-3.0"),
    CC_BY_SA_4_0("Creative Commons Attribution Share Alike 4.0 International", "CC-BY-SA-4.0"),
    CC_PDDC("Creative Commons Public Domain Dedication and Certification", "CC-PDDC"),
    CC0_1_0("Creative Commons Zero v1.0 Universal", "CC0-1.0"),
    CDDL_1_0("Common Development and Distribution License 1.0", "CDDL-1.0"),
    CDDL_1_1("Common Development and Distribution License 1.1", "CDDL-1.1"),
    CDLA_Permissive_1_0("Community Data License Agreement Permissive 1.0", "CDLA-Permissive-1.0"),
    CDLA_Sharing_1_0("Community Data License Agreement Sharing 1.0", "CDLA-Sharing-1.0"),
    CECILL_1_0("CeCILL Free Software License Agreement v1.0", "CECILL-1.0"),
    CECILL_1_1("CeCILL Free Software License Agreement v1.1", "CECILL-1.1"),
    CECILL_2_0("CeCILL Free Software License Agreement v2.0", "CECILL-2.0"),
    CECILL_2_1("CeCILL Free Software License Agreement v2.1", "CECILL-2.1"),
    CECILL_B("CeCILL-B Free Software License Agreement", "CECILL-B"),
    CECILL_C("CeCILL-C Free Software License Agreement", "CECILL-C"),
    CERN_OHL_1_1("CERN Open Hardware Licence v1.1", "CERN-OHL-1.1"),
    CERN_OHL_1_2("CERN Open Hardware Licence v1.2", "CERN-OHL-1.2"),
    ClArtistic("Clarified Artistic License", "ClArtistic"),
    CNRI_Jython("CNRI Jython License", "CNRI-Jython"),
    CNRI_Python("CNRI Python License", "CNRI-Python"),
    CNRI_Python_GPL_Compatible("CNRI Python Open Source GPL Compatible License Agreement", "CNRI-Python-GPL-Compatible"),
    Condor_1_1("Condor Public License v1.1", "Condor-1.1"),
    copyleft_next_0_3_0("copyleft-next 0.3.0", "copyleft-next-0.3.0"),
    copyleft_next_0_3_1("copyleft-next 0.3.1", "copyleft-next-0.3.1"),
    CPAL_1_0("Common Public Attribution License 1.0", "CPAL-1.0"),
    CPL_1_0("Common Public License 1.0", "CPL-1.0"),
    CPOL_1_02("Code Project Open License 1.02", "CPOL-1.02"),
    Crossword("Crossword License", "Crossword"),
    CrystalStacker("CrystalStacker License", "CrystalStacker"),
    CUA_OPL_1_0("CUA Office Public License v1.0", "CUA-OPL-1.0"),
    Cube("Cube License", "Cube"),
    curl("curl License", "curl"),
    D_FSL_1_0("Deutsche Freie Software Lizenz", "D-FSL-1.0"),
    diffmark("diffmark license", "diffmark"),
    DOC("DOC License", "DOC"),
    Dotseqn("Dotseqn License", "Dotseqn"),
    DSDP("DSDP License", "DSDP"),
    dvipdfm("dvipdfm License", "dvipdfm"),
    ECL_1_0("Educational Community License v1.0", "ECL-1.0"),
    ECL_2_0("Educational Community License v2.0", "ECL-2.0"),
    EFL_1_0("Eiffel Forum License v1.0", "EFL-1.0"),
    EFL_2_0("Eiffel Forum License v2.0", "EFL-2.0"),
    eGenix("eGenix.com Public License 1.1.0", "eGenix"),
    Entessa("Entessa Public License v1.0", "Entessa"),
    EPL_1_0("Eclipse Public License 1.0", "EPL-1.0"),
    EPL_2_0("Eclipse Public License 2.0", "EPL-2.0", "epl_2_0", { name, url ->
        url == "https://www.eclipse.org/legal/epl-v20.html"
    }),
    ErlPL_1_1("Erlang Public License v1.1", "ErlPL-1.1"),
    etalab_2_0("Etalab Open License 2.0", "etalab-2.0"),
    EUDatagrid("EU DataGrid Software License", "EUDatagrid"),
    EUPL_1_0("European Union Public License 1.0", "EUPL-1.0"),
    EUPL_1_1("European Union Public License 1.1", "EUPL-1.1"),
    EUPL_1_2("European Union Public License 1.2", "EUPL-1.2"),
    Eurosym("Eurosym License", "Eurosym"),
    Fair("Fair License", "Fair"),
    Frameworx_1_0("Frameworx Open License 1.0", "Frameworx-1.0"),
    FreeImage("FreeImage Public License v1.0", "FreeImage"),
    FSFAP("FSF All Permissive License", "FSFAP"),
    FSFUL("FSF Unlimited License", "FSFUL"),
    FSFULLR("FSF Unlimited License (with License Retention)", "FSFULLR"),
    FTL("Freetype Project License", "FTL"),
    GFDL_1_1_only("GNU Free Documentation License v1.1 only", "GFDL-1.1-only"),
    GFDL_1_1_or_later("GNU Free Documentation License v1.1 or later", "GFDL-1.1-or-later"),
    GFDL_1_2_only("GNU Free Documentation License v1.2 only", "GFDL-1.2-only"),
    GFDL_1_2_or_later("GNU Free Documentation License v1.2 or later", "GFDL-1.2-or-later"),
    GFDL_1_3_only("GNU Free Documentation License v1.3 only", "GFDL-1.3-only"),
    GFDL_1_3_or_later("GNU Free Documentation License v1.3 or later", "GFDL-1.3-or-later"),
    Giftware("Giftware License", "Giftware"),
    GL2PS("GL2PS License", "GL2PS"),
    Glide("3dfx Glide License", "Glide"),
    Glulxe("Glulxe License", "Glulxe"),
    gnuplot("gnuplot License", "gnuplot"),
    GPL_1_0_only("GNU General Public License v1.0 only", "GPL-1.0-only"),
    GPL_1_0_or_later("GNU General Public License v1.0 or later", "GPL-1.0-or-later"),
    GPL_2_0_only("GNU General Public License v2.0 only", "GPL-2.0-only"),
    GPL_2_0_or_later("GNU General Public License v2.0 or later", "GPL-2.0-or-later"),
    GPL_3_0_only("GNU General Public License v3.0 only", "GPL-3.0-only"),
    GPL_3_0_or_later("GNU General Public License v3.0 or later", "GPL-3.0-or-later"),
    gSOAP_1_3b("gSOAP Public License v1.3b", "gSOAP-1.3b"),
    HaskellReport("Haskell Language Report License", "HaskellReport"),
    HPND("Historical Permission Notice and Disclaimer", "HPND"),
    HPND_sell_variant("Historical Permission Notice and Disclaimer - sell variant", "HPND-sell-variant"),
    IBM_pibs("IBM PowerPC Initialization and Boot Software", "IBM-pibs"),
    ICU("ICU License", "ICU"),
    IJG("Independent JPEG Group License", "IJG"),
    ImageMagick("ImageMagick License", "ImageMagick"),
    iMatix("iMatix Standard Function Library Agreement", "iMatix"),
    Imlib2("Imlib2 License", "Imlib2"),
    Info_ZIP("Info-ZIP License", "Info-ZIP"),
    Intel("Intel Open Source License", "Intel"),
    Intel_ACPI("Intel ACPI Software License Agreement", "Intel-ACPI"),
    Interbase_1_0("Interbase Public License v1.0", "Interbase-1.0"),
    IPA("IPA Font License", "IPA"),
    IPL_1_0("IBM Public License v1.0", "IPL-1.0"),
    ISC("ISC License", "ISC"),
    JasPer_2_0("JasPer License", "JasPer-2.0"),
    JPNIC("Japan Network Information Center License", "JPNIC"),
    JSON("JSON License", "JSON"),
    LAL_1_2("Licence Art Libre 1.2", "LAL-1.2"),
    LAL_1_3("Licence Art Libre 1.3", "LAL-1.3"),
    Latex2e("Latex2e License", "Latex2e"),
    Leptonica("Leptonica License", "Leptonica"),
    LGPL_2_0_only("GNU Library General Public License v2 only", "LGPL-2.0-only"),
    LGPL_2_0_or_later("GNU Library General Public License v2 or later", "LGPL-2.0-or-later"),
    LGPL_2_1_only("GNU Lesser General Public License v2.1 only", "LGPL-2.1-only"),
    LGPL_2_1_or_later("GNU Lesser General Public License v2.1 or later", "LGPL-2.1-or-later"),
    LGPL_3_0_only("GNU Lesser General Public License v3.0 only", "LGPL-3.0-only"),
    LGPL_3_0_or_later("GNU Lesser General Public License v3.0 or later", "LGPL-3.0-or-later"),
    LGPLLR("Lesser General Public License For Linguistic Resources", "LGPLLR"),
    Libpng("libpng License", "Libpng"),
    libpng_2_0("PNG Reference Library version 2", "libpng-2.0"),
    libtiff("libtiff License", "libtiff"),
    LiLiQ_P_1_1("Licence Libre du Québec – Permissive version 1.1", "LiLiQ-P-1.1"),
    LiLiQ_R_1_1("Licence Libre du Québec – Réciprocité version 1.1", "LiLiQ-R-1.1"),
    LiLiQ_Rplus_1_1("Licence Libre du Québec – Réciprocité forte version 1.1", "LiLiQ-Rplus-1.1"),
    Linux_OpenIB("Linux Kernel Variant of OpenIB.org license", "Linux-OpenIB"),
    LPL_1_0("Lucent Public License Version 1.0", "LPL-1.0"),
    LPL_1_02("Lucent Public License v1.02", "LPL-1.02"),
    LPPL_1_0("LaTeX Project Public License v1.0", "LPPL-1.0"),
    LPPL_1_1("LaTeX Project Public License v1.1", "LPPL-1.1"),
    LPPL_1_2("LaTeX Project Public License v1.2", "LPPL-1.2"),
    LPPL_1_3a("LaTeX Project Public License v1.3a", "LPPL-1.3a"),
    LPPL_1_3c("LaTeX Project Public License v1.3c", "LPPL-1.3c"),
    MakeIndex("MakeIndex License", "MakeIndex"),
    MirOS("The MirOS Licence", "MirOS"),
    MIT_0("MIT No Attribution", "MIT-0"),
    MIT_advertising("Enlightenment License (e16)", "MIT-advertising"),
    MIT_CMU("CMU License", "MIT-CMU"),
    MIT_enna("enna License", "MIT-enna"),
    MIT_feh("feh License", "MIT-feh"),
    MITNFA("MIT +no-false-attribs license", "MITNFA"),
    Motosoto("Motosoto License", "Motosoto"),
    mpich2("mpich2 License", "mpich2"),
    MPL_1_0("Mozilla Public License 1.0", "MPL-1.0"),
    MPL_1_1("Mozilla Public License 1.1", "MPL-1.1"),
    MPL_2_0("Mozilla Public License 2.0", "MPL-2.0"),
    MPL_2_0_no_copyleft_exception("Mozilla Public License 2.0 (no copyleft exception)", "MPL-2.0-no-copyleft-exception"),
    MS_PL("Microsoft Public License", "MS-PL"),
    MS_RL("Microsoft Reciprocal License", "MS-RL"),
    MTLL("Matrix Template Library License", "MTLL"),
    MulanPSL_1_0("Mulan Permissive Software License, Version 1", "MulanPSL-1.0"),
    Multics("Multics License", "Multics"),
    Mup("Mup License", "Mup"),
    NASA_1_3("NASA Open Source Agreement 1.3", "NASA-1.3"),
    Naumen("Naumen Public License", "Naumen"),
    NBPL_1_0("Net Boolean Public License v1", "NBPL-1.0"),
    NCSA("University of Illinois/NCSA Open Source License", "NCSA"),
    Net_SNMP("Net-SNMP License", "Net-SNMP"),
    NetCDF("NetCDF license", "NetCDF"),
    Newsletr("Newsletr License", "Newsletr"),
    NGPL("Nethack General Public License", "NGPL"),
    NLOD_1_0("Norwegian Licence for Open Government Data", "NLOD-1.0"),
    NLPL("No Limit Public License", "NLPL"),
    Nokia("Nokia Open Source License", "Nokia"),
    NOSL("Netizen Open Source License", "NOSL"),
    Noweb("Noweb License", "Noweb"),
    NPL_1_0("Netscape Public License v1.0", "NPL-1.0"),
    NPL_1_1("Netscape Public License v1.1", "NPL-1.1"),
    NPOSL_3_0("Non-Profit Open Software License 3.0", "NPOSL-3.0"),
    NRL("NRL License", "NRL"),
    NTP("NTP License", "NTP"),
    OCCT_PL("Open CASCADE Technology Public License", "OCCT-PL"),
    OCLC_2_0("OCLC Research Public License 2.0", "OCLC-2.0"),
    ODbL_1_0("ODC Open Database License v1.0", "ODbL-1.0"),
    ODC_By_1_0("Open Data Commons Attribution License v1.0", "ODC-By-1.0"),
    OFL_1_0("SIL Open Font License 1.0", "OFL-1.0"),
    OFL_1_1("SIL Open Font License 1.1", "OFL-1.1"),
    OGL_Canada_2_0("Open Government Licence - Canada", "OGL-Canada-2.0"),
    OGL_UK_1_0("Open Government Licence v1.0", "OGL-UK-1.0"),
    OGL_UK_2_0("Open Government Licence v2.0", "OGL-UK-2.0"),
    OGL_UK_3_0("Open Government Licence v3.0", "OGL-UK-3.0"),
    OGTSL("Open Group Test Suite License", "OGTSL"),
    OLDAP_1_1("Open LDAP Public License v1.1", "OLDAP-1.1"),
    OLDAP_1_2("Open LDAP Public License v1.2", "OLDAP-1.2"),
    OLDAP_1_3("Open LDAP Public License v1.3", "OLDAP-1.3"),
    OLDAP_1_4("Open LDAP Public License v1.4", "OLDAP-1.4"),
    OLDAP_2_0("Open LDAP Public License v2.0 (or possibly 2.0A and 2.0B)", "OLDAP-2.0"),
    OLDAP_2_0_1("Open LDAP Public License v2.0.1", "OLDAP-2.0.1"),
    OLDAP_2_1("Open LDAP Public License v2.1", "OLDAP-2.1"),
    OLDAP_2_2("Open LDAP Public License v2.2", "OLDAP-2.2"),
    OLDAP_2_2_1("Open LDAP Public License v2.2.1", "OLDAP-2.2.1"),
    OLDAP_2_2_2("Open LDAP Public License 2.2.2", "OLDAP-2.2.2"),
    OLDAP_2_3("Open LDAP Public License v2.3", "OLDAP-2.3"),
    OLDAP_2_4("Open LDAP Public License v2.4", "OLDAP-2.4"),
    OLDAP_2_5("Open LDAP Public License v2.5", "OLDAP-2.5"),
    OLDAP_2_6("Open LDAP Public License v2.6", "OLDAP-2.6"),
    OLDAP_2_7("Open LDAP Public License v2.7", "OLDAP-2.7"),
    OLDAP_2_8("Open LDAP Public License v2.8", "OLDAP-2.8"),
    OML("Open Market License", "OML"),
    OpenSSL("OpenSSL License", "OpenSSL"),
    OPL_1_0("Open Public License v1.0", "OPL-1.0"),
    OSET_PL_2_1("OSET Public License version 2.1", "OSET-PL-2.1"),
    OSL_1_0("Open Software License 1.0", "OSL-1.0"),
    OSL_1_1("Open Software License 1.1", "OSL-1.1"),
    OSL_2_0("Open Software License 2.0", "OSL-2.0"),
    OSL_2_1("Open Software License 2.1", "OSL-2.1"),
    OSL_3_0("Open Software License 3.0", "OSL-3.0"),
    Parity_6_0_0("The Parity Public License 6.0.0", "Parity-6.0.0"),
    PDDL_1_0("ODC Public Domain Dedication &amp; License 1.0", "PDDL-1.0"),
    PHP_3_0("PHP License v3.0", "PHP-3.0"),
    PHP_3_01("PHP License v3.01", "PHP-3.01"),
    Plexus("Plexus Classworlds License", "Plexus"),
    PostgreSQL("PostgreSQL License", "PostgreSQL"),
    psfrag("psfrag License", "psfrag"),
    psutils("psutils License", "psutils"),
    Python_2_0("Python License 2.0", "Python-2.0"),
    Qhull("Qhull License", "Qhull"),
    QPL_1_0("Q Public License 1.0", "QPL-1.0"),
    Rdisc("Rdisc License", "Rdisc"),
    RHeCos_1_1("Red Hat eCos Public License v1.1", "RHeCos-1.1"),
    RPL_1_1("Reciprocal Public License 1.1", "RPL-1.1"),
    RPL_1_5("Reciprocal Public License 1.5", "RPL-1.5"),
    RPSL_1_0("RealNetworks Public Source License v1.0", "RPSL-1.0"),
    RSA_MD("RSA Message-Digest License", "RSA-MD"),
    RSCPL("Ricoh Source Code Public License", "RSCPL"),
    Ruby("Ruby License", "Ruby"),
    SAX_PD("Sax Public Domain Notice", "SAX-PD"),
    Saxpath("Saxpath License", "Saxpath"),
    SCEA("SCEA Shared Source License", "SCEA"),
    Sendmail("Sendmail License", "Sendmail"),
    Sendmail_8_23("Sendmail License 8.23", "Sendmail-8.23"),
    SGI_B_1_0("SGI Free Software License B v1.0", "SGI-B-1.0"),
    SGI_B_1_1("SGI Free Software License B v1.1", "SGI-B-1.1"),
    SGI_B_2_0("SGI Free Software License B v2.0", "SGI-B-2.0"),
    SHL_0_5("Solderpad Hardware License v0.5", "SHL-0.5"),
    SHL_0_51("Solderpad Hardware License, Version 0.51", "SHL-0.51"),
    SimPL_2_0("Simple Public License 2.0", "SimPL-2.0"),
    SISSL("Sun Industry Standards Source License v1.1", "SISSL"),
    SISSL_1_2("Sun Industry Standards Source License v1.2", "SISSL-1.2"),
    Sleepycat("Sleepycat License", "Sleepycat"),
    SMLNJ("Standard ML of New Jersey License", "SMLNJ"),
    SMPPL("Secure Messaging Protocol Public License", "SMPPL"),
    SNIA("SNIA Public License 1.1", "SNIA"),
    Spencer_86("Spencer License 86", "Spencer-86"),
    Spencer_94("Spencer License 94", "Spencer-94"),
    Spencer_99("Spencer License 99", "Spencer-99"),
    SPL_1_0("Sun Public License v1.0", "SPL-1.0"),
    SSH_OpenSSH("SSH OpenSSH license", "SSH-OpenSSH"),
    SSH_short("SSH short notice", "SSH-short"),
    SSPL_1_0("Server Side Public License, v 1", "SSPL-1.0"),
    SugarCRM_1_1_3("SugarCRM Public License v1.1.3", "SugarCRM-1.1.3"),
    SWL("Scheme Widget Library (SWL) Software License Agreement", "SWL"),
    TAPR_OHL_1_0("TAPR Open Hardware License v1.0", "TAPR-OHL-1.0"),
    TCL("TCL/TK License", "TCL"),
    TCP_wrappers("TCP Wrappers License", "TCP-wrappers"),
    TMate("TMate Open Source License", "TMate"),
    TORQUE_1_1("TORQUE v2.5+ Software License v1.1", "TORQUE-1.1"),
    TOSL("Trusster Open Source License", "TOSL"),
    TU_Berlin_1_0("Technische Universitaet Berlin License 1.0", "TU-Berlin-1.0"),
    TU_Berlin_2_0("Technische Universitaet Berlin License 2.0", "TU-Berlin-2.0"),
    UCL_1_0("Upstream Compatibility License v1.0", "UCL-1.0"),
    Unicode_DFS_2015("Unicode License Agreement - Data Files and Software (2015)", "Unicode-DFS-2015"),
    Unicode_DFS_2016("Unicode License Agreement - Data Files and Software (2016)", "Unicode-DFS-2016"),
    Unicode_TOU("Unicode Terms of Use", "Unicode-TOU"),
    Unlicense("The Unlicense", "Unlicense"),
    UPL_1_0("Universal Permissive License v1.0", "UPL-1.0"),
    Vim("Vim License", "Vim"),
    VOSTROM("VOSTROM Public License for Open Source", "VOSTROM"),
    VSL_1_0("Vovida Software License v1.0", "VSL-1.0"),
    W3C("W3C Software Notice and License (2002-12-31)", "W3C"),
    W3C_19980720("W3C Software Notice and License (1998-07-20)", "W3C-19980720"),
    W3C_20150513("W3C Software Notice and Document License (2015-05-13)", "W3C-20150513"),
    Watcom_1_0("Sybase Open Watcom Public License 1.0", "Watcom-1.0"),
    Wsuipa("Wsuipa License", "Wsuipa"),
    WTFPL("Do What The F*ck You Want To Public License", "WTFPL"),
    X11("X11 License", "X11"),
    Xerox("Xerox License", "Xerox"),
    XFree86_1_1("XFree86 License 1.1", "XFree86-1.1"),
    xinetd("xinetd License", "xinetd"),
    Xnet("X.Net License", "Xnet"),
    xpp("XPP License", "xpp"),
    XSkat("XSkat License", "XSkat"),
    YPL_1_0("Yahoo! Public License v1.0", "YPL-1.0"),
    YPL_1_1("Yahoo! Public License v1.1", "YPL-1.1"),
    Zed("Zed License", "Zed"),
    Zend_2_0("Zend License v2.0", "Zend-2.0"),
    Zimbra_1_3("Zimbra Public License v1.3", "Zimbra-1.3"),
    Zimbra_1_4("Zimbra Public License v1.4", "Zimbra-1.4"),
    Zlib("zlib License", "Zlib"),
    zlib_acknowledgement("zlib/libpng License with Acknowledgement", "zlib-acknowledgement"),
    ZPL_1_1("Zope Public License 1.1", "ZPL-1.1"),
    ZPL_2_0("Zope Public License 2.0", "ZPL-2.0"),
    ZPL_2_1("Zope Public License 2.1", "ZPL-2.1"),
    // Special handling section
    Apache_2_0("Apache License 2.0", "Apache-2.0", "apache_2_0", { name, url ->
        name.contains("Apache", true) && url.endsWith("LICENSE-2.0.txt")
    }),
    MIT("MIT License", "MIT", "mit", { name, url ->
        name.contains("MIT", true)
    }),
    ASDKL("Android Software Development Kit License", "ASDKL", "asdkl", { name, url ->
        name.contains("MIT", true)
    }),
    CTS("Crashlytics Terms of Service", "CTS", "cts"),
    FSSA("Fabric Software and Services Agreement", "FSSA", "cts");

    fun getUrl(): String {
        return "https://spdx.org/licenses/${id}.html"
    }
}