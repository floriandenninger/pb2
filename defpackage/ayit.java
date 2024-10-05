package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayit implements ayby {
    private final /* synthetic */ int a;

    public ayit(int i) {
        this.a = i;
    }

    @Override // defpackage.ayby
    public final /* synthetic */ Object a(String str) {
        if (this.a != 0) {
            return str;
        }
        amkq.F(str.length() > 0, "empty timeout");
        amkq.F(str.length() <= 9, "bad timeout format");
        long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
        char charAt = str.charAt(str.length() - 1);
        if (charAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
        }
        if (charAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
        }
        if (charAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
        }
        if (charAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
        }
        if (charAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
        }
        if (charAt == 'n') {
            return Long.valueOf(parseLong);
        }
        throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(charAt)));
    }

    @Override // defpackage.ayby
    public final /* synthetic */ String b(Object obj) {
        if (this.a == 0) {
            Long l = (Long) obj;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            }
            if (l.longValue() < 100000000) {
                String valueOf = String.valueOf(l);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
                sb.append(valueOf);
                sb.append("n");
                return sb.toString();
            }
            if (l.longValue() < 100000000000L) {
                long micros = timeUnit.toMicros(l.longValue());
                StringBuilder sb2 = new StringBuilder(21);
                sb2.append(micros);
                sb2.append("u");
                return sb2.toString();
            }
            if (l.longValue() < 100000000000000L) {
                long millis = timeUnit.toMillis(l.longValue());
                StringBuilder sb3 = new StringBuilder(21);
                sb3.append(millis);
                sb3.append("m");
                return sb3.toString();
            }
            if (l.longValue() < 100000000000000000L) {
                long seconds = timeUnit.toSeconds(l.longValue());
                StringBuilder sb4 = new StringBuilder(21);
                sb4.append(seconds);
                sb4.append("S");
                return sb4.toString();
            }
            if (l.longValue() < 6000000000000000000L) {
                long minutes = timeUnit.toMinutes(l.longValue());
                StringBuilder sb5 = new StringBuilder(21);
                sb5.append(minutes);
                sb5.append("M");
                return sb5.toString();
            }
            long hours = timeUnit.toHours(l.longValue());
            StringBuilder sb6 = new StringBuilder(21);
            sb6.append(hours);
            sb6.append("H");
            return sb6.toString();
        }
        return (String) obj;
    }
}
