package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akds implements aker {
    private static final int[] a = {271};
    private static final Pattern b = Pattern.compile("^\\s+");
    private static final Pattern c = Pattern.compile("\\s{2,}");
    private final akdn d;
    private final akdr e;

    public akds(akdn akdnVar, akdr akdrVar) {
        akdnVar.getClass();
        this.d = akdnVar;
        akdrVar.getClass();
        this.e = akdrVar;
    }

    @Override // defpackage.aker
    public final akdy a(akel akelVar) {
        ammv i;
        awzs awzsVar;
        awzs awzsVar2;
        int i2;
        akdr akdrVar = this.e;
        akdrVar.b();
        synchronized (akdrVar) {
            i = ammv.i(akdrVar.c);
        }
        if (!i.h()) {
            akdy.a.f = akmq.c(akelVar);
            return akdy.a;
        }
        ammv h = this.d.h();
        Locale locale = akelVar.b.isEmpty() ? Locale.ENGLISH : new Locale(akelVar.b);
        if (!h.h() || !locale.getLanguage().equals(new Locale((String) h.c()).getLanguage())) {
            akdy.a.f = akmq.c(akelVar);
            return akdy.a;
        }
        awzt awztVar = (awzt) i.c();
        String lowerCase = c.matcher(b.matcher(akelVar.d).replaceAll("")).replaceAll(" ").toLowerCase(locale);
        ArrayList arrayList = new ArrayList();
        if (!lowerCase.isEmpty()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(awztVar.b, "r");
                int i3 = 2;
                String str = null;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (i4 < lowerCase.length()) {
                    try {
                        if (i5 == 0) {
                            randomAccessFile.seek(i3);
                            if ((awzt.c(awztVar.a.b, randomAccessFile) & 1) == 1) {
                                randomAccessFile.skipBytes(awztVar.a.b);
                            }
                            i5 = 0;
                            while (true) {
                                str = awzt.b(randomAccessFile);
                                if (str == null) {
                                    str = null;
                                    break;
                                }
                                int c2 = awzt.c(1, randomAccessFile);
                                int i7 = (c2 & 1) ^ 1;
                                if (i7 == 0) {
                                    i3 = ((awzt.c(awztVar.a.a - 1, randomAccessFile) << 8) | c2) >>> 1;
                                } else {
                                    i6 = (c2 | (awzt.c(awztVar.a.b - 1, randomAccessFile) << 8)) >>> 1;
                                }
                                if (lowerCase.codePointAt(i4) == str.codePointAt(0)) {
                                    i5 = i7;
                                    break;
                                }
                                i5 = i7;
                            }
                            if (str != null && (lowerCase.substring(i4).startsWith(str) || str.startsWith(lowerCase.substring(i4)))) {
                                i4 += str.length();
                            }
                        }
                        awzsVar = null;
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                }
                awzsVar = new awzs();
                String substring = str.substring(str.length() - (i4 - lowerCase.length()));
                String valueOf = String.valueOf(lowerCase);
                String valueOf2 = String.valueOf(substring);
                awzsVar.a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                awzsVar.b = 1 == i5;
                awzsVar.d = i3;
                if (i5 == 0) {
                    randomAccessFile.seek(i3);
                    awzsVar.c = awzt.c(awztVar.a.b, randomAccessFile) >>> 1;
                } else {
                    awzsVar.c = i6;
                }
                if (!substring.isEmpty()) {
                    substring.codePointAt(0);
                }
                if (awzsVar != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(awzsVar);
                    while (true) {
                        int i8 = 0;
                        while (true) {
                            if (i8 >= arrayList2.size()) {
                                awzsVar2 = null;
                                i2 = 0;
                                break;
                            }
                            if (!((awzs) arrayList2.get(i8)).b) {
                                awzsVar2 = (awzs) arrayList2.get(i8);
                                arrayList2.remove(i8);
                                i2 = awztVar.c - i8;
                                break;
                            }
                            i8++;
                        }
                        if (awzsVar2 == null) {
                            break;
                        }
                        randomAccessFile.seek(awzsVar2.d);
                        if ((awzt.c(awztVar.a.b, randomAccessFile) & 1) == 1) {
                            awzs awzsVar3 = new awzs();
                            awzsVar3.a = awzsVar2.a;
                            awzsVar3.c = awzt.c(awztVar.a.b, randomAccessFile);
                            awzsVar3.b = true;
                            awztVar.a(arrayList2, awzsVar3);
                        }
                        ArrayList arrayList3 = new ArrayList();
                        while (i2 > 0) {
                            String b2 = awzt.b(randomAccessFile);
                            if (b2 == null) {
                                break;
                            }
                            awzs awzsVar4 = new awzs();
                            String valueOf3 = String.valueOf(awzsVar2.a);
                            awzsVar4.a = b2.length() != 0 ? valueOf3.concat(b2) : new String(valueOf3);
                            int c3 = awzt.c(1, randomAccessFile);
                            int i9 = (c3 & 1) ^ 1;
                            if (i9 != 0) {
                                awzsVar4.c = (c3 | (awzt.c(awztVar.a.b - 1, randomAccessFile) << 8)) >>> 1;
                            } else {
                                awzsVar4.d = (c3 | (awzt.c(awztVar.a.a - 1, randomAccessFile) << 8)) >>> 1;
                            }
                            awzsVar4.b = 1 == i9;
                            arrayList3.add(awzsVar4);
                            i2--;
                        }
                        int size = arrayList3.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            awzs awzsVar5 = (awzs) arrayList3.get(i10);
                            if (!awzsVar5.b) {
                                randomAccessFile.seek(awzsVar5.d);
                                awzsVar5.c = awzt.c(awztVar.a.b, randomAccessFile) >>> 1;
                            }
                            awztVar.a(arrayList2, awzsVar5);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((awzs) it.next()).a);
                    }
                }
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(new akef((String) it2.next(), 23, a));
        }
        akdy akdyVar = new akdy(arrayList4, this.d.l(), this.d.c());
        akdyVar.f = akmq.c(akelVar);
        return akdyVar;
    }
}
