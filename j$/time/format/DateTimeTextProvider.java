package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class DateTimeTextProvider {
    private static final ConcurrentMap CACHE = new ConcurrentHashMap(16, 0.75f, 2);
    private static final Comparator COMPARATOR = new Comparator() { // from class: j$.time.format.DateTimeTextProvider.1
        @Override // java.util.Comparator
        public int compare(Map.Entry entry, Map.Entry entry2) {
            return ((String) entry2.getKey()).length() - ((String) entry.getKey()).length();
        }
    };
    private static final DateTimeTextProvider INSTANCE = new DateTimeTextProvider();

    public String getText(TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        Object findStore = findStore(temporalField, locale);
        if (findStore instanceof LocaleStore) {
            return ((LocaleStore) findStore).getText(j, textStyle);
        }
        return null;
    }

    public String getText(Chronology chronology, TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        if (chronology == IsoChronology.INSTANCE || !(temporalField instanceof ChronoField)) {
            return getText(temporalField, j, textStyle, locale);
        }
        return null;
    }

    private Object findStore(TemporalField temporalField, Locale locale) {
        Map.Entry createEntry = createEntry(temporalField, locale);
        ConcurrentMap concurrentMap = CACHE;
        Object obj = concurrentMap.get(createEntry);
        if (obj != null) {
            return obj;
        }
        concurrentMap.putIfAbsent(createEntry, createStore(temporalField, locale));
        return concurrentMap.get(createEntry);
    }

    private Object createStore(TemporalField temporalField, Locale locale) {
        HashMap hashMap = new HashMap();
        int i = 0;
        if (temporalField == ChronoField.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            while (i < eras.length) {
                if (!eras[i].isEmpty()) {
                    long j = i;
                    hashMap2.put(Long.valueOf(j), eras[i]);
                    hashMap3.put(Long.valueOf(j), firstCodePoint(eras[i]));
                }
                i++;
            }
            if (!hashMap2.isEmpty()) {
                hashMap.put(TextStyle.FULL, hashMap2);
                hashMap.put(TextStyle.SHORT, hashMap2);
                hashMap.put(TextStyle.NARROW, hashMap3);
            }
            return new LocaleStore(hashMap);
        }
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            String[] months = dateFormatSymbols2.getMonths();
            for (int i2 = 0; i2 < months.length; i2++) {
                if (!months[i2].isEmpty()) {
                    long j2 = i2 + 1;
                    hashMap4.put(Long.valueOf(j2), months[i2]);
                    hashMap5.put(Long.valueOf(j2), firstCodePoint(months[i2]));
                }
            }
            if (!hashMap4.isEmpty()) {
                hashMap.put(TextStyle.FULL, hashMap4);
                hashMap.put(TextStyle.NARROW, hashMap5);
            }
            HashMap hashMap6 = new HashMap();
            String[] shortMonths = dateFormatSymbols2.getShortMonths();
            while (i < shortMonths.length) {
                if (!shortMonths[i].isEmpty()) {
                    hashMap6.put(Long.valueOf(i + 1), shortMonths[i]);
                }
                i++;
            }
            if (!hashMap6.isEmpty()) {
                hashMap.put(TextStyle.SHORT, hashMap6);
            }
            return new LocaleStore(hashMap);
        }
        if (temporalField == ChronoField.DAY_OF_WEEK) {
            DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap7 = new HashMap();
            String[] weekdays = dateFormatSymbols3.getWeekdays();
            hashMap7.put(1L, weekdays[2]);
            hashMap7.put(2L, weekdays[3]);
            hashMap7.put(3L, weekdays[4]);
            hashMap7.put(4L, weekdays[5]);
            hashMap7.put(5L, weekdays[6]);
            hashMap7.put(6L, weekdays[7]);
            hashMap7.put(7L, weekdays[1]);
            hashMap.put(TextStyle.FULL, hashMap7);
            HashMap hashMap8 = new HashMap();
            hashMap8.put(1L, firstCodePoint(weekdays[2]));
            hashMap8.put(2L, firstCodePoint(weekdays[3]));
            hashMap8.put(3L, firstCodePoint(weekdays[4]));
            hashMap8.put(4L, firstCodePoint(weekdays[5]));
            hashMap8.put(5L, firstCodePoint(weekdays[6]));
            hashMap8.put(6L, firstCodePoint(weekdays[7]));
            hashMap8.put(7L, firstCodePoint(weekdays[1]));
            hashMap.put(TextStyle.NARROW, hashMap8);
            HashMap hashMap9 = new HashMap();
            String[] shortWeekdays = dateFormatSymbols3.getShortWeekdays();
            hashMap9.put(1L, shortWeekdays[2]);
            hashMap9.put(2L, shortWeekdays[3]);
            hashMap9.put(3L, shortWeekdays[4]);
            hashMap9.put(4L, shortWeekdays[5]);
            hashMap9.put(5L, shortWeekdays[6]);
            hashMap9.put(6L, shortWeekdays[7]);
            hashMap9.put(7L, shortWeekdays[1]);
            hashMap.put(TextStyle.SHORT, hashMap9);
            return new LocaleStore(hashMap);
        }
        if (temporalField != ChronoField.AMPM_OF_DAY) {
            return "";
        }
        DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
        HashMap hashMap10 = new HashMap();
        HashMap hashMap11 = new HashMap();
        String[] amPmStrings = dateFormatSymbols4.getAmPmStrings();
        while (i < amPmStrings.length) {
            if (!amPmStrings[i].isEmpty()) {
                long j3 = i;
                hashMap10.put(Long.valueOf(j3), amPmStrings[i]);
                hashMap11.put(Long.valueOf(j3), firstCodePoint(amPmStrings[i]));
            }
            i++;
        }
        if (!hashMap10.isEmpty()) {
            hashMap.put(TextStyle.FULL, hashMap10);
            hashMap.put(TextStyle.SHORT, hashMap10);
            hashMap.put(TextStyle.NARROW, hashMap11);
        }
        return new LocaleStore(hashMap);
    }

    private static String firstCodePoint(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map.Entry createEntry(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class LocaleStore {
        private final Map parsable;
        private final Map valueTextMap;

        /* JADX INFO: Access modifiers changed from: package-private */
        public LocaleStore(Map map) {
            this.valueTextMap = map;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    hashMap2.put((String) entry2.getValue(), DateTimeTextProvider.createEntry((String) entry2.getValue(), (Long) entry2.getKey()));
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.values());
                Collections.sort(arrayList2, DateTimeTextProvider.COMPARATOR);
                hashMap.put((TextStyle) entry.getKey(), arrayList2);
                arrayList.addAll(arrayList2);
                hashMap.put(null, arrayList);
            }
            Collections.sort(arrayList, DateTimeTextProvider.COMPARATOR);
            this.parsable = hashMap;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String getText(long j, TextStyle textStyle) {
            Map map = (Map) this.valueTextMap.get(textStyle);
            if (map != null) {
                return (String) map.get(Long.valueOf(j));
            }
            return null;
        }
    }
}
