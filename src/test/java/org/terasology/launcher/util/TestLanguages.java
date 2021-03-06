// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0

package org.terasology.launcher.util;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

final class TestLanguages {

    TestLanguages() {
    }

    @Test
    void testDefaultLanguage() {
        assertEquals(Locale.ENGLISH, Languages.DEFAULT_LOCALE);
    }

    @Test
    void testUpdateWithDefault() {
        Languages.update(Languages.DEFAULT_LOCALE);
        assertSame(Languages.DEFAULT_LOCALE, Languages.getCurrentLocale());
    }

    @Test
    void testUpdateWithEnglish() {
        Languages.update(Locale.ENGLISH);
        assertSame(Locale.ENGLISH, Languages.getCurrentLocale());
    }

    @Test
    void testUpdateWithGerman() {
        Languages.update(Locale.GERMAN);
        assertSame(Locale.GERMAN, Languages.getCurrentLocale());
    }

    @Test
    void testUpdateWithGermany() {
        Languages.update(Languages.DEFAULT_LOCALE);
        Languages.update(Locale.GERMANY);
        assertSame(Languages.DEFAULT_LOCALE, Languages.getCurrentLocale());
    }

    @Test
    void testUpdateWithJapanese() {
        Languages.update(Locale.JAPANESE);
        assertSame(Locale.JAPANESE, Languages.getCurrentLocale());
    }

    @Test
    void testUpdateWithJapan() {
        Languages.update(Languages.DEFAULT_LOCALE);
        Languages.update(Locale.JAPAN);
        assertSame(Languages.DEFAULT_LOCALE, Languages.getCurrentLocale());
    }

    @Test
    void testInitWithDefault() {
        Languages.init(Languages.DEFAULT_LOCALE.toString());
        assertSame(Languages.DEFAULT_LOCALE, Languages.getCurrentLocale());
    }

    @Test
    void testInitWithEnglish() {
        Languages.init(Locale.ENGLISH.toString());
        assertSame(Locale.ENGLISH, Languages.getCurrentLocale());
    }

    @Test
    void testInitWithGerman() {
        Languages.init(Locale.GERMAN.toString());
        assertSame(Locale.GERMAN, Languages.getCurrentLocale());
    }

    @Test
    void testInitWithGermany() {
        Languages.init(Languages.DEFAULT_LOCALE.toString());
        Languages.init(Locale.GERMANY.toString());
        assertSame(Languages.DEFAULT_LOCALE, Languages.getCurrentLocale());
    }

    @Test
    void testInitWithJapanese() {
        Languages.init(Locale.JAPANESE.toString());
        assertSame(Locale.JAPANESE, Languages.getCurrentLocale());
    }

    @Test
    void testInitWithJapan() {
        Languages.init(Languages.DEFAULT_LOCALE.toString());
        Languages.init(Locale.JAPAN.toString());
        assertSame(Languages.DEFAULT_LOCALE, Languages.getCurrentLocale());
    }

    @Test
    void testSize() {
        assertEquals(Languages.SUPPORTED_LOCALES.size(), Languages.SETTINGS_LABEL_KEYS.size());
    }

    @AfterAll
    static void resetLanguages() {
        Languages.init(Languages.DEFAULT_LOCALE.toString());
    }
}
