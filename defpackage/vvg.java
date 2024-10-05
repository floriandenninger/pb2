package defpackage;

import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vvg extends axks {
    private static final Pattern a = Pattern.compile("([+-])([0-9]{2})([0-9]{2})?([0-9]{2})?(\\.[0-9]+)?([+-])([0-9]{3})([0-9]{2})?([0-9]{2})?(\\.[0-9]+)?(?:[+-][0-9]+(?:\\.[0-9]+)?)?(?:CRS.*)?/");
    private double b;
    private double c;

    public vvg() {
        super("©xyz");
    }

    @Override // defpackage.axkq
    protected final long h() {
        return 22L;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        int ah = did.ah(byteBuffer);
        did.ao(byteBuffer, 2);
        Matcher matcher = a.matcher(did.ao(byteBuffer, ah));
        if (!matcher.matches()) {
            this.c = Double.NaN;
            this.b = Double.NaN;
            return;
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        String group3 = matcher.group(3);
        String group4 = matcher.group(4);
        String group5 = matcher.group(5);
        if (group5 != null) {
            if (group4 != null) {
                group4 = group5.length() != 0 ? group4.concat(group5) : new String(group4);
            } else if (group3 != null) {
                group3 = group5.length() != 0 ? group3.concat(group5) : new String(group3);
            } else {
                String valueOf = String.valueOf(group2);
                group2 = group5.length() != 0 ? valueOf.concat(group5) : new String(valueOf);
            }
        }
        double parseDouble = Double.parseDouble(group2) + (group3 != null ? Double.parseDouble(group3) / 60.0d : 0.0d) + (group4 != null ? Double.parseDouble(group4) / 3600.0d : 0.0d);
        double d = true != "-".equals(group) ? 1 : -1;
        Double.isNaN(d);
        double d2 = parseDouble * d;
        this.c = d2;
        if (d2 < -90.0d || d2 > 90.0d) {
            this.c = Double.NaN;
        }
        String group6 = matcher.group(6);
        String group7 = matcher.group(7);
        String group8 = matcher.group(8);
        String group9 = matcher.group(9);
        String group10 = matcher.group(10);
        if (group10 != null) {
            if (group9 != null) {
                group9 = group10.length() != 0 ? group9.concat(group10) : new String(group9);
            } else if (group8 != null) {
                group8 = group10.length() != 0 ? group8.concat(group10) : new String(group8);
            } else {
                String valueOf2 = String.valueOf(group7);
                group7 = group10.length() != 0 ? valueOf2.concat(group10) : new String(valueOf2);
            }
        }
        double parseDouble2 = Double.parseDouble(group7) + (group8 != null ? Double.parseDouble(group8) / 60.0d : 0.0d) + (group9 != null ? Double.parseDouble(group9) / 3600.0d : 0.0d);
        double d3 = true == "-".equals(group6) ? -1 : 1;
        Double.isNaN(d3);
        double d4 = d3 * parseDouble2;
        this.b = d4;
        if (d4 < -180.0d || d4 > 180.0d) {
            this.b = Double.NaN;
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        did.Y(byteBuffer, 18);
        byteBuffer.put(new byte[]{21, -57});
        long round = Math.round(this.c * 10000.0d);
        long j = round < 0 ? -round : round;
        long j2 = j / 10000;
        long j3 = j % 10000;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[3];
        objArr[0] = Character.valueOf(round >= 0 ? '+' : '-');
        objArr[1] = Long.valueOf(j2);
        objArr[2] = Long.valueOf(j3);
        byteBuffer.put(did.U(String.format(locale, "%c%02d.%04d", objArr)));
        long round2 = Math.round(this.b * 10000.0d);
        long j4 = round2 < 0 ? -round2 : round2;
        long j5 = j4 / 10000;
        long j6 = j4 % 10000;
        Locale locale2 = Locale.ENGLISH;
        Object[] objArr2 = new Object[3];
        objArr2[0] = Character.valueOf(round2 < 0 ? '-' : '+');
        objArr2[1] = Long.valueOf(j5);
        objArr2[2] = Long.valueOf(j6);
        byteBuffer.put(did.U(String.format(locale2, "%c%03d.%04d", objArr2)));
        byteBuffer.put(did.U("/"));
    }
}
