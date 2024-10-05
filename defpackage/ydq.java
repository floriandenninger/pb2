package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.android.billingclient.api.BillingClientNativeCallback;
import com.android.billingclient.api.SkuDetails;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PlayBillingCommandOuterClass$PlayBillingCommand;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ydq implements cmi, cmq, ypd {
    public static final String a = "ydq";
    cma b;
    PlayBillingCommandOuterClass$PlayBillingCommand c;
    private final Activity d;
    private final acpl e;
    private final aahd f;
    private final afsy g;
    private final ycs h;
    private final aahv i;
    private final Object j = new Object();
    private int k = 0;
    private boolean l = false;
    private boolean m = false;
    private String n;
    private final axze o;

    public ydq(Activity activity, acpl acplVar, ypa ypaVar, afsy afsyVar, aahd aahdVar, axze axzeVar, aahv aahvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = activity;
        this.e = acplVar;
        this.g = afsyVar;
        this.f = aahdVar;
        this.o = axzeVar;
        this.i = aahvVar;
        ycs ycsVar = new ycs();
        this.h = ycsVar;
        ycsVar.b = new DialogInterface.OnKeyListener() { // from class: ydp
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                ydq ydqVar = ydq.this;
                if (i != 4) {
                    return true;
                }
                ydqVar.c();
                ydqVar.e();
                return true;
            }
        };
        ypaVar.g(this);
    }

    private final String i() {
        String str = this.n;
        if (str == null || str.isEmpty()) {
            afsx c = this.g.c();
            if (!(c instanceof AccountIdentity)) {
                String str2 = a;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 71);
                sb.append("playPayment::");
                sb.append(str2);
                sb.append(" Failed to get buyer email: It is not an account identity.");
                afsi.b(2, 11, sb.toString());
                return null;
            }
            String a2 = ((AccountIdentity) c).a();
            this.n = a2;
            return a2;
        }
        return this.n;
    }

    private final synchronized void j(PlayBillingCommandOuterClass$PlayBillingCommand playBillingCommandOuterClass$PlayBillingCommand) {
        String str = a;
        zga.h(str, "Continue billing flow.");
        this.m = false;
        if (playBillingCommandOuterClass$PlayBillingCommand != null) {
            try {
                atwj atwjVar = playBillingCommandOuterClass$PlayBillingCommand.c;
                if (atwjVar == null) {
                    atwjVar = atwj.a;
                }
                cmj cmjVar = new cmj();
                if (atwjVar.d.size() == 0) {
                    zga.c(str, "Invalid play cart payload, empty sku details");
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
                    sb.append("playPayment::");
                    sb.append(str);
                    sb.append(" Invalid play cart payload, empty sku details");
                    afsi.b(2, 11, sb.toString());
                    throw new IllegalArgumentException("Invalid play cart payload, empty sku details");
                }
                ArrayList arrayList = new ArrayList();
                for (String str2 : atwjVar.d) {
                    try {
                        arrayList.add(new SkuDetails(str2));
                    } catch (IllegalArgumentException | JSONException e) {
                        String valueOf = String.valueOf(str2);
                        String concat = valueOf.length() != 0 ? "Invalid SkuDetails json string: ".concat(valueOf) : new String("Invalid SkuDetails json string: ");
                        String str3 = a;
                        String valueOf2 = String.valueOf(e);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(concat).length() + 1 + String.valueOf(valueOf2).length());
                        sb2.append(concat);
                        sb2.append(" ");
                        sb2.append(valueOf2);
                        zga.c(str3, sb2.toString());
                        String valueOf3 = String.valueOf(e);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 15 + String.valueOf(concat).length() + String.valueOf(valueOf3).length());
                        sb3.append("playPayment::");
                        sb3.append(str3);
                        sb3.append(" ");
                        sb3.append(concat);
                        sb3.append(" ");
                        sb3.append(valueOf3);
                        afsi.b(2, 11, sb3.toString());
                        throw new IllegalArgumentException(concat, e);
                    }
                }
                cmjVar.c = arrayList;
                if ((atwjVar.b & 1) != 0 && !atwjVar.c.isEmpty()) {
                    if ((atwjVar.b & 2) != 0) {
                        cmk cmkVar = new cmk();
                        cmkVar.b = atwjVar.c;
                        cmkVar.a = atwjVar.e;
                        if (TextUtils.isEmpty(cmkVar.a) && TextUtils.isEmpty(cmkVar.b)) {
                            throw new IllegalArgumentException("Old SKU purchase token/id must be provided.");
                        }
                        cmk cmkVar2 = new cmk();
                        cmkVar2.a = cmkVar.a;
                        cmkVar2.b = cmkVar.b;
                        cmjVar.a = cmkVar2.a;
                        cmjVar.b = cmkVar2.b;
                    } else {
                        String str4 = a;
                        zga.c(str4, "Invalid play cart payload, empty SubscriptionConsistencyToken for update purchase");
                        StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 95);
                        sb4.append("playPayment::");
                        sb4.append(str4);
                        sb4.append(" Invalid play cart payload, empty SubscriptionConsistencyToken for update purchase");
                        afsi.b(2, 11, sb4.toString());
                        throw new IllegalArgumentException("Invalid play cart payload, empty SubscriptionConsistencyToken for update purchase");
                    }
                }
                ArrayList arrayList2 = cmjVar.c;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    throw new IllegalArgumentException("Details of the products must be provided.");
                }
                if (cmjVar.c.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (cmjVar.c.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) cmjVar.c.get(0);
                    String d = skuDetails.d();
                    ArrayList arrayList3 = cmjVar.c;
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList3.get(i);
                        if (!d.equals("play_pass_subs") && !skuDetails2.d().equals("play_pass_subs") && !d.equals(skuDetails2.d())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String a2 = skuDetails.a();
                    ArrayList arrayList4 = cmjVar.c;
                    int size2 = arrayList4.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList4.get(i2);
                        if (!d.equals("play_pass_subs") && !skuDetails3.d().equals("play_pass_subs") && !a2.equals(skuDetails3.a())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
                cml cmlVar = new cml();
                cmlVar.a = !((SkuDetails) cmjVar.c.get(0)).a().isEmpty();
                cmlVar.b = cmjVar.a;
                cmlVar.c = cmjVar.b;
                ArrayList arrayList5 = cmjVar.c;
                cmlVar.e = arrayList5 != null ? new ArrayList(arrayList5) : new ArrayList();
                cmlVar.d = amru.q();
                String str5 = a;
                zga.h(str5, "Start loading play cart.");
                cmn a3 = this.b.a(this.d, cmlVar);
                int i3 = a3.a;
                String str6 = a3.b;
                StringBuilder sb5 = new StringBuilder(String.valueOf(str6).length() + 37);
                sb5.append("Play cart loading result:");
                sb5.append(i3);
                sb5.append(" ");
                sb5.append(str6);
                zga.h(str5, sb5.toString());
                int i4 = a3.a;
                if (i4 != 0) {
                    String str7 = a3.b;
                    StringBuilder sb6 = new StringBuilder(String.valueOf(str7).length() + 77);
                    sb6.append("Can not display the play cart, error code is: ");
                    sb6.append(i4);
                    sb6.append(", debug message is: ");
                    sb6.append(str7);
                    String sb7 = sb6.toString();
                    zga.c(str5, sb7);
                    StringBuilder sb8 = new StringBuilder(String.valueOf(str5).length() + 14 + String.valueOf(sb7).length());
                    sb8.append("playPayment::");
                    sb8.append(str5);
                    sb8.append(" ");
                    sb8.append(sb7);
                    afsi.b(2, 11, sb8.toString());
                    l(m(a3), a3.b);
                    whu.K(this.d, R.string.payment_wallet_processing_error, 1);
                    return;
                }
                zga.h(str5, "Display the play cart successfully.");
                ydr ydrVar = new ydr();
                PlayBillingCommandOuterClass$PlayBillingCommand playBillingCommandOuterClass$PlayBillingCommand2 = this.c;
                if (playBillingCommandOuterClass$PlayBillingCommand2 != null && (playBillingCommandOuterClass$PlayBillingCommand2.b & 2) != 0) {
                    ydrVar.a = playBillingCommandOuterClass$PlayBillingCommand2.d;
                }
                acpl acplVar = this.e;
                arpn a4 = arpp.a();
                awfv g = ydrVar.g();
                a4.copyOnWrite();
                ((arpp) a4.instance).dS(g);
                acplVar.c((arpp) a4.build());
                return;
            } catch (IllegalArgumentException e2) {
                String valueOf4 = String.valueOf(e2.getMessage());
                String concat2 = valueOf4.length() != 0 ? "Can not display the play cart. Billing flow params is empty because ".concat(valueOf4) : new String("Can not display the play cart. Billing flow params is empty because ");
                String str8 = a;
                zga.c(str8, concat2);
                StringBuilder sb9 = new StringBuilder(String.valueOf(str8).length() + 14 + String.valueOf(concat2).length());
                sb9.append("playPayment::");
                sb9.append(str8);
                sb9.append(" ");
                sb9.append(concat2);
                afsi.b(2, 11, sb9.toString());
                whu.K(this.d, R.string.payment_wallet_processing_error, 1);
                l(29, e2.getMessage());
                return;
            }
        }
        zga.c(str, "Continue billing flow failed because play billing command is null.");
        StringBuilder sb10 = new StringBuilder(String.valueOf(str).length() + 80);
        sb10.append("playPayment::");
        sb10.append(str);
        sb10.append(" Continue billing flow failed because play billing command is null.");
        afsi.b(2, 11, sb10.toString());
        whu.K(this.d, R.string.payment_wallet_processing_error, 1);
    }

    private final void k() {
        synchronized (this.j) {
            if (this.l) {
                return;
            }
            this.h.show(this.d.getFragmentManager(), ycs.a);
            this.l = true;
        }
    }

    private final void l(int i, String str) {
        ydr ydrVar = new ydr();
        ydrVar.c = i;
        PlayBillingCommandOuterClass$PlayBillingCommand playBillingCommandOuterClass$PlayBillingCommand = this.c;
        if (playBillingCommandOuterClass$PlayBillingCommand != null && (playBillingCommandOuterClass$PlayBillingCommand.b & 2) != 0) {
            ydrVar.a = playBillingCommandOuterClass$PlayBillingCommand.d;
        }
        if (str != null && !str.isEmpty()) {
            ydrVar.b = str;
        }
        this.e.c(ydrVar.b());
    }

    private static final int m(cmn cmnVar) {
        int i = cmnVar.a;
        if (i == -3) {
            return 24;
        }
        if (i == -2) {
            return 25;
        }
        if (i == -1) {
            return 26;
        }
        if (i == 11) {
            return 33;
        }
        switch (i) {
            case 2:
                return 27;
            case 3:
                return 28;
            case 4:
                return 29;
            case 5:
                return 30;
            case 6:
                return 31;
            case 7:
                return 32;
            default:
                return 1;
        }
    }

    @Override // defpackage.cmi
    public final void a(cmn cmnVar) {
        String str = a;
        int i = cmnVar.a;
        String str2 = cmnVar.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 60);
        sb.append("Play Billing Client Setup Finished with result: ");
        sb.append(i);
        sb.append(" ");
        sb.append(str2);
        zga.h(str, sb.toString());
        int i2 = cmnVar.a;
        if (i2 == -1) {
            zga.m(str, "Billing client service is disconnected, need to reconnect it.");
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 75);
            sb2.append("playPayment::");
            sb2.append(str);
            sb2.append(" Billing client service is disconnected, need to reconnect it.");
            afsi.b(1, 11, sb2.toString());
            l(m(cmnVar), cmnVar.b);
            h();
            return;
        }
        if (i2 == 0) {
            if (this.m) {
                e();
                j(this.c);
                return;
            }
            return;
        }
        String str3 = cmnVar.b;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 75);
        sb3.append("Billing client setup failure: error code is ");
        sb3.append(i2);
        sb3.append(" , error message is ");
        sb3.append(str3);
        String sb4 = sb3.toString();
        zga.c(str, sb4);
        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 14 + String.valueOf(sb4).length());
        sb5.append("playPayment::");
        sb5.append(str);
        sb5.append(" ");
        sb5.append(sb4);
        afsi.b(2, 11, sb5.toString());
        l(m(cmnVar), cmnVar.b);
        if (this.m) {
            e();
            c();
            whu.K(this.d, R.string.payment_wallet_processing_error, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cmq
    public final void b(cmn cmnVar, List list) {
        String str = a;
        int i = cmnVar.a;
        String str2 = cmnVar.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 41);
        sb.append("Receive Play payment update: ");
        sb.append(i);
        sb.append(" ");
        sb.append(str2);
        zga.h(str, sb.toString());
        int i2 = cmnVar.a;
        if (i2 == -1) {
            h();
            l(m(cmnVar), cmnVar.b);
        } else if (i2 != 0) {
            if (i2 == 1) {
                PlayBillingCommandOuterClass$PlayBillingCommand playBillingCommandOuterClass$PlayBillingCommand = this.c;
                if (playBillingCommandOuterClass$PlayBillingCommand == null) {
                    zga.c(str, "Handle cancelled payment result failed, because play billing command is empty.");
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 92);
                    sb2.append("playPayment::");
                    sb2.append(str);
                    sb2.append(" Handle cancelled payment result failed, because play billing command is empty.");
                    afsi.b(2, 11, sb2.toString());
                } else {
                    aahd aahdVar = this.f;
                    apxf apxfVar = playBillingCommandOuterClass$PlayBillingCommand.e;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.a(apxfVar);
                    ydr ydrVar = new ydr();
                    PlayBillingCommandOuterClass$PlayBillingCommand playBillingCommandOuterClass$PlayBillingCommand2 = this.c;
                    if (playBillingCommandOuterClass$PlayBillingCommand2 != null && (playBillingCommandOuterClass$PlayBillingCommand2.b & 2) != 0) {
                        ydrVar.a = playBillingCommandOuterClass$PlayBillingCommand2.d;
                    }
                    this.e.c(ydrVar.a());
                    c();
                    whu.K(this.d, R.string.payment_purchase_cancelled, 1);
                }
            } else {
                PlayBillingCommandOuterClass$PlayBillingCommand playBillingCommandOuterClass$PlayBillingCommand3 = this.c;
                if (playBillingCommandOuterClass$PlayBillingCommand3 == null) {
                    zga.c(str, "Handle default payment result failed, because play billing command is empty.");
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 90);
                    sb3.append("playPayment::");
                    sb3.append(str);
                    sb3.append(" Handle default payment result failed, because play billing command is empty.");
                    afsi.b(2, 11, sb3.toString());
                    whu.K(this.d, R.string.payment_wallet_processing_error, 1);
                } else {
                    aahd aahdVar2 = this.f;
                    apxf apxfVar2 = playBillingCommandOuterClass$PlayBillingCommand3.f;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    aahdVar2.a(apxfVar2);
                }
                l(m(cmnVar), cmnVar.b);
            }
        } else if (list == null || list.isEmpty()) {
            zga.c(str, "FirstPartyPurchases value is null or empty");
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 56);
            sb4.append("playPayment::");
            sb4.append(str);
            sb4.append(" FirstPartyPurchases value is null or empty");
            afsi.b(2, 11, sb4.toString());
            whu.K(this.d, R.string.payment_wallet_processing_error, 1);
        } else {
            PlayBillingCommandOuterClass$PlayBillingCommand playBillingCommandOuterClass$PlayBillingCommand4 = this.c;
            if (playBillingCommandOuterClass$PlayBillingCommand4 == null) {
                zga.c(str, "PlayBillingCommand is null");
                StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 40);
                sb5.append("playPayment::");
                sb5.append(str);
                sb5.append(" PlayBillingCommand is null");
                afsi.b(2, 11, sb5.toString());
                whu.K(this.d, R.string.payment_wallet_processing_error, 1);
            } else if ((playBillingCommandOuterClass$PlayBillingCommand4.b & 64) != 0) {
                aahu a2 = this.i.a(this.g.c());
                String str3 = this.c.h;
                str3.getClass();
                amkq.O(!str3.isEmpty(), "key cannot be empty");
                aone createBuilder = aqar.a.createBuilder();
                createBuilder.copyOnWrite();
                aqar aqarVar = (aqar) createBuilder.instance;
                aqarVar.b |= 1;
                aqarVar.c = str3;
                aqao aqaoVar = new aqao(createBuilder);
                aone createBuilder2 = aqav.a.createBuilder();
                aone createBuilder3 = aqax.a.createBuilder();
                ArrayList arrayList = new ArrayList();
                amxe it = ((amru) list).iterator();
                while (it.hasNext()) {
                    cmp cmpVar = (cmp) it.next();
                    aone createBuilder4 = aqaw.a.createBuilder();
                    String optString = cmpVar.a.optString("purchaseId");
                    createBuilder4.copyOnWrite();
                    aqaw aqawVar = (aqaw) createBuilder4.instance;
                    optString.getClass();
                    aqawVar.b |= 1;
                    aqawVar.c = optString;
                    int i3 = cmpVar.a.optInt("purchaseState", 1) != 4 ? 2 : 3;
                    createBuilder4.copyOnWrite();
                    aqaw aqawVar2 = (aqaw) createBuilder4.instance;
                    aqawVar2.d = i3 - 1;
                    aqawVar2.b |= 2;
                    arrayList.add((aqaw) createBuilder4.build());
                }
                createBuilder3.copyOnWrite();
                aqax aqaxVar = (aqax) createBuilder3.instance;
                aony aonyVar = aqaxVar.b;
                if (!aonyVar.c()) {
                    aqaxVar.b = aonm.mutableCopy(aonyVar);
                }
                aolo.addAll((Iterable) arrayList, (List) aqaxVar.b);
                createBuilder2.copyOnWrite();
                aqav aqavVar = (aqav) createBuilder2.instance;
                aqax aqaxVar2 = (aqax) createBuilder3.build();
                aqaxVar2.getClass();
                aqavVar.c = aqaxVar2;
                aqavVar.b = 1;
                aqav aqavVar2 = (aqav) createBuilder2.build();
                aone aoneVar = aqaoVar.a;
                aoneVar.copyOnWrite();
                aqar aqarVar2 = (aqar) aoneVar.instance;
                aqavVar2.getClass();
                aqarVar2.d = aqavVar2;
                aqarVar2.b |= 2;
                aqaq a3 = aqaoVar.a(a2);
                aalc c = a2.c();
                c.d(a3);
                c.b().T();
                aahd aahdVar3 = this.f;
                apxf apxfVar3 = this.c.g;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                aahdVar3.a(apxfVar3);
            } else {
                zga.c(str, "CommerceAcquisitionClientPayloadEntityKey is null in the PlayBillingCommand");
                StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 89);
                sb6.append("playPayment::");
                sb6.append(str);
                sb6.append(" CommerceAcquisitionClientPayloadEntityKey is null in the PlayBillingCommand");
                afsi.b(2, 11, sb6.toString());
                whu.K(this.d, R.string.payment_wallet_processing_error, 1);
            }
            ydr ydrVar2 = new ydr();
            PlayBillingCommandOuterClass$PlayBillingCommand playBillingCommandOuterClass$PlayBillingCommand5 = this.c;
            if (playBillingCommandOuterClass$PlayBillingCommand5 != null && (playBillingCommandOuterClass$PlayBillingCommand5.b & 2) != 0) {
                ydrVar2.a = playBillingCommandOuterClass$PlayBillingCommand5.d;
            }
            this.e.c(ydrVar2.d());
        }
        this.c = null;
    }

    public final void c() {
        this.m = false;
        this.c = null;
    }

    public final void d() {
        zga.h(a, "Clean up on app destroy or account switch.");
        c();
        this.k = 0;
        this.n = null;
        cma cmaVar = this.b;
        if (cmaVar == null) {
            return;
        }
        try {
            cly clyVar = cmaVar.d;
            clx clxVar = clyVar.b;
            Context context = clyVar.a;
            if (clxVar.b) {
                context.unregisterReceiver(clxVar.c.b);
                clxVar.b = false;
            } else {
                cms.f("BillingBroadcastManager", "Receiver is not registered.");
            }
            if (cmaVar.f != null) {
                cmh cmhVar = cmaVar.f;
                synchronized (cmhVar.a) {
                    cmhVar.c = null;
                    cmhVar.b = true;
                }
            }
            if (cmaVar.f != null && cmaVar.p != null) {
                int i = cms.a;
                cmaVar.e.unbindService(cmaVar.f);
                cmaVar.f = null;
            }
            cmaVar.p = null;
            ExecutorService executorService = cmaVar.o;
            if (executorService != null) {
                executorService.shutdownNow();
                cmaVar.o = null;
            }
        } catch (Exception e) {
            cms.g("BillingClient", "There was an exception while ending connection!", e);
        } finally {
            cmaVar.a = 3;
        }
        this.b = null;
    }

    public final void e() {
        synchronized (this.j) {
            if (this.l) {
                this.h.dismiss();
                this.l = false;
            }
        }
    }

    public final synchronized void g(PlayBillingCommandOuterClass$PlayBillingCommand playBillingCommandOuterClass$PlayBillingCommand) {
        String str = a;
        zga.h(str, "Start launch billing flow.");
        this.c = playBillingCommandOuterClass$PlayBillingCommand;
        ydr ydrVar = new ydr();
        PlayBillingCommandOuterClass$PlayBillingCommand playBillingCommandOuterClass$PlayBillingCommand2 = this.c;
        if (playBillingCommandOuterClass$PlayBillingCommand2 != null && (playBillingCommandOuterClass$PlayBillingCommand2.b & 2) != 0) {
            ydrVar.a = playBillingCommandOuterClass$PlayBillingCommand2.d;
        }
        this.e.c(ydrVar.e());
        if (playBillingCommandOuterClass$PlayBillingCommand == null) {
            l(35, "Launch billing flow failed because play billing command is null.");
            zga.c(str, "Launch billing flow failed because play billing command is null.");
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
            sb.append("playPayment::");
            sb.append(str);
            sb.append(" Launch billing flow failed because play billing command is null.");
            afsi.b(2, 11, sb.toString());
            whu.K(this.d, R.string.payment_wallet_processing_error, 1);
            return;
        }
        if (i().equals(playBillingCommandOuterClass$PlayBillingCommand.i)) {
            this.m = true;
            cma cmaVar = this.b;
            if (cmaVar == null || cmaVar.a != 2) {
                h();
                return;
            } else {
                j(playBillingCommandOuterClass$PlayBillingCommand);
                return;
            }
        }
        l(34, null);
        zga.c(str, "Launch billing flow failed because email account mismatch.");
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 72);
        sb2.append("playPayment::");
        sb2.append(str);
        sb2.append(" Launch billing flow failed because email account mismatch.");
        afsi.b(2, 11, sb2.toString());
        whu.K(this.d, R.string.payment_wallet_processing_error, 1);
        d();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afto.class};
        }
        if (i == 0) {
            d();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final synchronized void h() {
        cma cmaVar = this.b;
        if (cmaVar == null || cmaVar.a != 2) {
            cma cmaVar2 = this.b;
            if (cmaVar2 != null && cmaVar2.a == 1) {
                if (this.m) {
                    k();
                    return;
                }
                return;
            }
            ((Boolean) this.o.a.a.Y(axzb.e).B().aB()).booleanValue();
            if (this.k < 3) {
                if (this.m) {
                    k();
                }
                cma cmaVar3 = this.b;
                if (cmaVar3 == null || cmaVar3.a == 3) {
                    String i = i();
                    if (i == null) {
                        String str = a;
                        zga.c(str, "Can not warm up billing client because there's no account email.");
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
                        sb.append("playPayment::");
                        sb.append(str);
                        sb.append(" Can not warm up billing client because there's no account email.");
                        afsi.b(2, 11, sb.toString());
                        return;
                    }
                    clz clzVar = new clz(this.d);
                    clzVar.d = this;
                    clzVar.b = true;
                    clzVar.a = i;
                    BillingClientNativeCallback billingClientNativeCallback = clzVar.e;
                    if (clzVar.d == null) {
                        throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
                    }
                    BillingClientNativeCallback billingClientNativeCallback2 = clzVar.e;
                    if (clzVar.b) {
                        BillingClientNativeCallback billingClientNativeCallback3 = clzVar.e;
                        this.b = new cma(clzVar.a, clzVar.b, clzVar.c, clzVar.d);
                    } else {
                        throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
                    }
                }
                this.k++;
                zga.h(a, "Play Billing Client start connection.");
                cma cmaVar4 = this.b;
                if (cmaVar4.c()) {
                    int i2 = cms.a;
                    a(cmo.g);
                    return;
                }
                if (cmaVar4.a == 1) {
                    cms.f("BillingClient", "Client is already in the process of connecting to billing service.");
                    a(cmo.c);
                    return;
                }
                if (cmaVar4.a == 3) {
                    cms.f("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    a(cmo.h);
                    return;
                }
                cmaVar4.a = 1;
                cly clyVar = cmaVar4.d;
                clx clxVar = clyVar.b;
                Context context = clyVar.a;
                IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                if (!clxVar.b) {
                    context.registerReceiver(clxVar.c.b, intentFilter);
                    clxVar.b = true;
                }
                int i3 = cms.a;
                cmaVar4.f = new cmh(cmaVar4, this);
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                intent.setPackage("com.android.vending");
                List<ResolveInfo> queryIntentServices = cmaVar4.e.getPackageManager().queryIntentServices(intent, 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    ResolveInfo resolveInfo = queryIntentServices.get(0);
                    if (resolveInfo.serviceInfo != null) {
                        String str2 = resolveInfo.serviceInfo.packageName;
                        String str3 = resolveInfo.serviceInfo.name;
                        if (!"com.android.vending".equals(str2) || str3 == null) {
                            cms.f("BillingClient", "The device doesn't have valid Play Store.");
                        } else {
                            ComponentName componentName = new ComponentName(str2, str3);
                            Intent intent2 = new Intent(intent);
                            intent2.setComponent(componentName);
                            intent2.putExtra("playBillingLibraryVersion", cmaVar4.b);
                            if (cmaVar4.e.bindService(intent2, cmaVar4.f, 1)) {
                                return;
                            } else {
                                cms.f("BillingClient", "Connection to Billing service is blocked.");
                            }
                        }
                    }
                }
                cmaVar4.a = 0;
                a(cmo.b);
                return;
            }
            String str4 = a;
            zga.m(str4, "Reach the reconnection limit for the billing client in the current activity cycle.");
            StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 96);
            sb2.append("playPayment::");
            sb2.append(str4);
            sb2.append(" Reach the reconnection limit for the billing client in the current activity cycle.");
            afsi.b(1, 11, sb2.toString());
            if (this.m) {
                e();
                c();
                whu.K(this.d, R.string.payment_wallet_processing_error, 1);
            }
        }
    }
}
