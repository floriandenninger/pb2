package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceLoader;

/* loaded from: classes5.dex */
public abstract class AbstractChronology implements Chronology {
    private static final ConcurrentHashMap CHRONOS_BY_ID = new ConcurrentHashMap();
    private static final ConcurrentHashMap CHRONOS_BY_TYPE = new ConcurrentHashMap();
    private static final Locale JAPANESE_CALENDAR_LOCALE = new Locale("ja", "JP", "JP");

    @Override // j$.time.chrono.Chronology
    public /* synthetic */ ChronoLocalDateTime localDateTime(TemporalAccessor temporalAccessor) {
        return Chronology.CC.$default$localDateTime(this, temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    public /* synthetic */ ChronoZonedDateTime zonedDateTime(Instant instant, ZoneId zoneId) {
        return Chronology.CC.$default$zonedDateTime(this, instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public /* synthetic */ ChronoZonedDateTime zonedDateTime(TemporalAccessor temporalAccessor) {
        return Chronology.CC.$default$zonedDateTime(this, temporalAccessor);
    }

    static Chronology registerChrono(Chronology chronology) {
        return registerChrono(chronology, chronology.getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Chronology registerChrono(Chronology chronology, String str) {
        String calendarType;
        Chronology chronology2 = (Chronology) CHRONOS_BY_ID.putIfAbsent(str, chronology);
        if (chronology2 == null && (calendarType = chronology.getCalendarType()) != null) {
            CHRONOS_BY_TYPE.putIfAbsent(calendarType, chronology);
        }
        return chronology2;
    }

    private static boolean initCache() {
        if (CHRONOS_BY_ID.get("ISO") != null) {
            return false;
        }
        registerChrono(HijrahChronology.INSTANCE);
        registerChrono(JapaneseChronology.INSTANCE);
        registerChrono(MinguoChronology.INSTANCE);
        registerChrono(ThaiBuddhistChronology.INSTANCE);
        Iterator it = ServiceLoader.load(AbstractChronology.class, null).iterator();
        while (it.hasNext()) {
            AbstractChronology abstractChronology = (AbstractChronology) it.next();
            if (!abstractChronology.getId().equals("ISO")) {
                registerChrono(abstractChronology);
            }
        }
        registerChrono(IsoChronology.INSTANCE);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Chronology of(String str) {
        Objects.requireNonNull(str, "id");
        do {
            Chronology of0 = of0(str);
            if (of0 != null) {
                return of0;
            }
        } while (initCache());
        Iterator it = ServiceLoader.load(Chronology.class).iterator();
        while (it.hasNext()) {
            Chronology chronology = (Chronology) it.next();
            if (str.equals(chronology.getId()) || str.equals(chronology.getCalendarType())) {
                return chronology;
            }
        }
        String valueOf = String.valueOf(str);
        throw new DateTimeException(valueOf.length() != 0 ? "Unknown chronology: ".concat(valueOf) : new String("Unknown chronology: "));
    }

    private static Chronology of0(String str) {
        Chronology chronology = (Chronology) CHRONOS_BY_ID.get(str);
        return chronology == null ? (Chronology) CHRONOS_BY_TYPE.get(str) : chronology;
    }

    @Override // java.lang.Comparable
    public int compareTo(Chronology chronology) {
        return getId().compareTo(chronology.getId());
    }

    @Override // j$.time.chrono.Chronology
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractChronology) && compareTo((Chronology) obj) == 0;
    }

    @Override // j$.time.chrono.Chronology
    public int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    @Override // j$.time.chrono.Chronology
    public String toString() {
        return getId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object writeReplace() {
        return new Ser((byte) 1, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeUTF(getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Chronology readExternal(DataInput dataInput) {
        return Chronology.CC.of(dataInput.readUTF());
    }
}
