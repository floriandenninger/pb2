package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import com.google.android.libraries.youtube.mdx.model.AutoValue_AppStatus;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer;
import j$.util.stream.Stream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acys {
    public static final String a = zga.a("MDX.DialDeviceFinder");
    static final Pattern b = Pattern.compile("^(.+?): (.+)$");
    static final Object c = new Object();
    public static DatagramPacket d;
    public final String e;
    public final ScheduledExecutorService f;
    public final yrw g;
    public final Set h;
    public final Set i;
    public final Set j;
    public final Map k;
    public boolean l;
    public final aczd m;
    public final adtv n;
    public final acpl o;
    public final shf p;
    public final Map q;
    public final acyc r;
    private final acyg s;
    private final azrw t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final acun x;

    public acys(String str, acyg acygVar, azrw azrwVar, yrw yrwVar, acyc acycVar, adtv adtvVar, acpl acplVar, shf shfVar, boolean z, acun acunVar) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(3, new yna("mdxSsdp"));
        aczc aczcVar = new aczc();
        this.q = new HashMap();
        this.j = Collections.newSetFromMap(new ConcurrentHashMap());
        this.h = Collections.newSetFromMap(new ConcurrentHashMap());
        this.i = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f = newScheduledThreadPool;
        this.k = new ConcurrentHashMap();
        this.e = str;
        this.s = acygVar;
        this.t = azrwVar;
        this.g = yrwVar;
        this.m = aczcVar;
        this.n = adtvVar;
        this.o = acplVar;
        this.p = shfVar;
        this.u = z;
        this.v = acunVar.m;
        this.w = acunVar.s;
        this.r = acycVar;
        this.x = acunVar;
    }

    public static String g(Element element, String str) {
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if ((item instanceof Element) && str.equals(item.getLocalName()) && "urn:schemas-upnp-org:device-1-0".equals(item.getNamespaceURI())) {
                return item.getTextContent();
            }
        }
        return null;
    }

    private final boolean i(AppStatus appStatus) {
        int i = ((AutoValue_AppStatus) appStatus).a;
        return i == -2 || i == -1 || (!this.v && i == 0);
    }

    public final void a() {
        this.j.clear();
        this.h.clear();
    }

    public final void b(acyp acypVar) {
        c(acypVar, true);
    }

    public final void c(final acyp acypVar, boolean z) {
        this.i.add(acypVar);
        if (this.l) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                acypVar.a((adfy) it.next());
            }
            return;
        }
        if (z && this.w) {
            final String b2 = this.n.b();
            if (!b2.isEmpty() && !b2.equals("<unknown ssid>")) {
                final acyc acycVar = this.r;
                ynm.i(anfq.h(acycVar.j.a(), new amml() { // from class: acyb
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        int n;
                        acyc acycVar2 = acyc.this;
                        String str = b2;
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : Collections.unmodifiableMap(((awva) obj).c).entrySet()) {
                            String str2 = (String) entry.getKey();
                            awux awuxVar = (awux) entry.getValue();
                            awuy awuyVar = awuxVar.d;
                            if (awuyVar == null) {
                                awuyVar = awuy.a;
                            }
                            int p = awxr.p(awuyVar.g);
                            if (p != 0 && p == 3) {
                                awuy awuyVar2 = awuxVar.d;
                                if (awuyVar2 == null) {
                                    awuyVar2 = awuy.a;
                                }
                                if ((awuyVar2.b & 64) != 0) {
                                    awuy awuyVar3 = awuxVar.d;
                                    if (awuyVar3 == null) {
                                        awuyVar3 = awuy.a;
                                    }
                                    awvc awvcVar = awuyVar3.i;
                                    if (awvcVar == null) {
                                        awvcVar = awvc.a;
                                    }
                                    if (awvcVar.c.equals(str)) {
                                        awuy awuyVar4 = awuxVar.d;
                                        if (awuyVar4 == null) {
                                            awuyVar4 = awuy.a;
                                        }
                                        awvc awvcVar2 = awuyVar4.i;
                                        if (awvcVar2 == null) {
                                            awvcVar2 = awvc.a;
                                        }
                                        if (!awvcVar2.d.isEmpty()) {
                                            if (acycVar2.i) {
                                                awuy awuyVar5 = awuxVar.d;
                                                if (awuyVar5 == null) {
                                                    awuyVar5 = awuy.a;
                                                }
                                                if (!TextUtils.isEmpty(awuyVar5.c)) {
                                                }
                                            }
                                            long c2 = acycVar2.b.c();
                                            awuy awuyVar6 = awuxVar.d;
                                            if (awuyVar6 == null) {
                                                awuyVar6 = awuy.a;
                                            }
                                            awvc awvcVar3 = awuyVar6.i;
                                            if (awvcVar3 == null) {
                                                awvcVar3 = awvc.a;
                                            }
                                            long j = awvcVar3.f;
                                            if (j >= 0 && j <= c2 && j + acycVar2.d >= c2) {
                                                long j2 = acycVar2.f;
                                                if (j2 > 0 && c2 > j2) {
                                                    long j3 = c2 - j2;
                                                    int i = 0;
                                                    int i2 = 0;
                                                    for (awvb awvbVar : Collections.unmodifiableMap(awuxVar.e).values()) {
                                                        if (awvbVar.e >= j3 && (n = awxr.n(awvbVar.c)) != 0 && n == 4) {
                                                            i++;
                                                            int o = awxr.o(awvbVar.d);
                                                            if (o != 0 && o == 3) {
                                                                i2++;
                                                            }
                                                        }
                                                    }
                                                    double d2 = i > 0 ? i2 / i : 1.0d;
                                                    if (i >= acycVar2.g && d2 < acycVar2.h) {
                                                    }
                                                }
                                                adfx i3 = adfy.i();
                                                i3.j = new adgn(str2);
                                                awuy awuyVar7 = awuxVar.d;
                                                if (awuyVar7 == null) {
                                                    awuyVar7 = awuy.a;
                                                }
                                                i3.d = awuyVar7.c;
                                                awuy awuyVar8 = awuxVar.d;
                                                if (awuyVar8 == null) {
                                                    awuyVar8 = awuy.a;
                                                }
                                                i3.e = awuyVar8.d;
                                                awuy awuyVar9 = awuxVar.d;
                                                if (awuyVar9 == null) {
                                                    awuyVar9 = awuy.a;
                                                }
                                                i3.b(awuyVar9.f);
                                                awuy awuyVar10 = awuxVar.d;
                                                if (awuyVar10 == null) {
                                                    awuyVar10 = awuy.a;
                                                }
                                                awvc awvcVar4 = awuyVar10.i;
                                                if (awvcVar4 == null) {
                                                    awvcVar4 = awvc.a;
                                                }
                                                i3.c(awvcVar4.c);
                                                awuy awuyVar11 = awuxVar.d;
                                                if (awuyVar11 == null) {
                                                    awuyVar11 = awuy.a;
                                                }
                                                awvc awvcVar5 = awuyVar11.i;
                                                if (awvcVar5 == null) {
                                                    awvcVar5 = awvc.a;
                                                }
                                                i3.h = awvcVar5.d;
                                                awuy awuyVar12 = awuxVar.d;
                                                if (awuyVar12 == null) {
                                                    awuyVar12 = awuy.a;
                                                }
                                                awvc awvcVar6 = awuyVar12.i;
                                                if (awvcVar6 == null) {
                                                    awvcVar6 = awvc.a;
                                                }
                                                i3.d(awvcVar6.e);
                                                i3.e(1);
                                                adfq c3 = AppStatus.c();
                                                c3.e(-2);
                                                awuy awuyVar13 = awuxVar.d;
                                                if (awuyVar13 == null) {
                                                    awuyVar13 = awuy.a;
                                                }
                                                String str3 = awuyVar13.j;
                                                awuy awuyVar14 = awuxVar.d;
                                                if (awuyVar14 == null) {
                                                    awuyVar14 = awuy.a;
                                                }
                                                c3.b(amrz.l("brand", str3, "model", awuyVar14.k));
                                                i3.a = c3.a();
                                                arrayList.add(i3.a());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return arrayList;
                    }
                }, angq.a), new ynl() { // from class: acyh
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        final acyp acypVar2 = acyp.this;
                        Stream stream = Collection.EL.stream((List) obj);
                        acypVar2.getClass();
                        stream.forEach(new Consumer() { // from class: acym
                            @Override // j$.util.function.Consumer
                            public final void accept(Object obj2) {
                                acyp.this.a((adfy) obj2);
                            }

                            @Override // j$.util.function.Consumer
                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer.CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                });
            }
        }
        this.l = true;
        this.f.execute(new acyk(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x010d A[Catch: all -> 0x0210, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0025, B:8:0x0038, B:10:0x0044, B:12:0x004e, B:14:0x008c, B:15:0x0071, B:19:0x007b, B:23:0x0085, B:27:0x008f, B:28:0x009d, B:30:0x00c3, B:32:0x00db, B:33:0x00f4, B:35:0x010d, B:36:0x0122, B:38:0x0128, B:40:0x0140, B:43:0x0156, B:45:0x016e, B:47:0x0182, B:50:0x018a, B:53:0x0195, B:55:0x0199, B:57:0x01ad, B:58:0x01a1, B:60:0x01a5, B:62:0x01b5, B:64:0x01b9, B:66:0x01c3, B:67:0x0206, B:72:0x01cc, B:74:0x01d6, B:75:0x01f5, B:76:0x01fe), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0128 A[Catch: all -> 0x0210, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0025, B:8:0x0038, B:10:0x0044, B:12:0x004e, B:14:0x008c, B:15:0x0071, B:19:0x007b, B:23:0x0085, B:27:0x008f, B:28:0x009d, B:30:0x00c3, B:32:0x00db, B:33:0x00f4, B:35:0x010d, B:36:0x0122, B:38:0x0128, B:40:0x0140, B:43:0x0156, B:45:0x016e, B:47:0x0182, B:50:0x018a, B:53:0x0195, B:55:0x0199, B:57:0x01ad, B:58:0x01a1, B:60:0x01a5, B:62:0x01b5, B:64:0x01b9, B:66:0x01c3, B:67:0x0206, B:72:0x01cc, B:74:0x01d6, B:75:0x01f5, B:76:0x01fe), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0195 A[Catch: all -> 0x0210, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0025, B:8:0x0038, B:10:0x0044, B:12:0x004e, B:14:0x008c, B:15:0x0071, B:19:0x007b, B:23:0x0085, B:27:0x008f, B:28:0x009d, B:30:0x00c3, B:32:0x00db, B:33:0x00f4, B:35:0x010d, B:36:0x0122, B:38:0x0128, B:40:0x0140, B:43:0x0156, B:45:0x016e, B:47:0x0182, B:50:0x018a, B:53:0x0195, B:55:0x0199, B:57:0x01ad, B:58:0x01a1, B:60:0x01a5, B:62:0x01b5, B:64:0x01b9, B:66:0x01c3, B:67:0x0206, B:72:0x01cc, B:74:0x01d6, B:75:0x01f5, B:76:0x01fe), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(java.lang.String r9, defpackage.adfy r10, java.util.Map r11) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acys.d(java.lang.String, adfy, java.util.Map):void");
    }

    public final void e(DatagramSocket datagramSocket) {
        int i;
        boolean z;
        int i2 = 2000;
        try {
            datagramSocket.setSoTimeout(2000);
        } catch (SocketException e) {
            zga.f(a, "Error setting socket timeout", e);
        }
        DatagramPacket datagramPacket = new DatagramPacket(new byte[1024], 1024);
        final byte[] bArr = new byte[512];
        ArrayList arrayList = new ArrayList();
        while (true) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                datagramSocket.receive(datagramPacket);
                z = true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException e2) {
                if (!datagramSocket.isClosed()) {
                    zga.f(a, "Error receiving m search response packet", e2);
                }
                z = false;
            }
            i2 -= (int) (System.currentTimeMillis() - currentTimeMillis);
            if (i2 <= 0) {
                break;
            }
            if (z) {
                String str = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
                if (this.u && str.length() != 0) {
                    "ssdp response: ".concat(str);
                }
                final HashMap hashMap = new HashMap();
                Matcher matcher = b.matcher("");
                Scanner scanner = new Scanner(str);
                while (scanner.hasNextLine()) {
                    matcher.reset(scanner.nextLine());
                    if (matcher.matches()) {
                        hashMap.put(matcher.group(1).toUpperCase(Locale.US), matcher.group(2));
                    }
                }
                scanner.close();
                Future future = null;
                if ("urn:dial-multiscreen-org:service:dial:1".equals(hashMap.get("ST"))) {
                    final String str2 = (String) hashMap.get("LOCATION");
                    if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(Uri.parse(str2).getHost())) {
                        String str3 = a;
                        String valueOf = String.valueOf(str2);
                        zga.m(str3, valueOf.length() != 0 ? "Ignoring device with unusable LOCATION: ".concat(valueOf) : new String("Ignoring device with unusable LOCATION: "));
                    } else if (!this.j.contains(str2)) {
                        this.j.add(str2);
                        if (this.k.containsKey(str2)) {
                            d(str2, (adfy) this.k.get(str2), hashMap);
                        } else {
                            future = this.f.submit(new Callable() { // from class: acyl
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    acys acysVar = acys.this;
                                    String str4 = str2;
                                    Map map = hashMap;
                                    byte[] bArr2 = bArr;
                                    ysj b2 = ysk.b(str4);
                                    b2.c("Origin", "package:com.google.android.youtube");
                                    adyu.w(acysVar.g, b2.a(), new acyn(acysVar, map, bArr2, str4));
                                    return null;
                                }
                            });
                        }
                    }
                }
                if (future != null) {
                    arrayList.add(future);
                }
            }
        }
        int size = arrayList.size();
        long j = 7300;
        for (i = 0; i < size; i++) {
            Future future2 = (Future) arrayList.get(i);
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                future2.get(j, TimeUnit.MILLISECONDS);
                j = Math.max(0L, j - (System.currentTimeMillis() - currentTimeMillis2));
            } catch (InterruptedException unused2) {
                zga.c(a, "Read device response task cancelled while waiting for reading device description task to complete");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Future) it.next()).cancel(true);
                }
                return;
            } catch (ExecutionException e3) {
                zga.f(a, "Error waiting for reading device description task to complete", e3);
            } catch (TimeoutException e4) {
                zga.f(a, "Timed out whilst reading device description", e4);
            }
        }
    }

    public final void f(acyp acypVar) {
        this.i.remove(acypVar);
    }

    public final int h() {
        String b2 = this.n.b();
        if (b2.isEmpty() || b2.equals("<unknown ssid>")) {
            return 1;
        }
        return b2.equals(this.n.b()) ? 2 : 3;
    }
}
