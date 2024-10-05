package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amae implements vez {
    final /* synthetic */ amag c;
    final /* synthetic */ amaj d;
    final /* synthetic */ String b = "accountmanager";
    public final AtomicReference a = new AtomicReference();

    public amae(amag amagVar, amaj amajVar) {
        this.c = amagVar;
        this.d = amajVar;
        "accountmanager".concat("_account_data_cleared_to_fix_downgrade");
    }

    @Override // defpackage.vez
    public final anhy a() {
        return anaf.K(this.c.b.submit(new amad(this, 1)), this.c.c.b(new akpw(11), angq.a)).a(anaf.aa(), angq.a);
    }

    @Override // defpackage.vez
    public final anhy b(aooy aooyVar) {
        final amaj amajVar = this.d;
        final amaf amafVar = (amaf) this.a.get();
        final amal amalVar = (amal) aooyVar;
        return anaf.T(amjk.b(new anfy() { // from class: amah
            @Override // defpackage.anfy
            public final anhy a() {
                String str;
                amaj amajVar2 = amaj.this;
                final amaf amafVar2 = amafVar;
                final amal amalVar2 = amalVar;
                final ArrayList arrayList = new ArrayList();
                int a = amafVar2.a();
                amrp f = amru.f();
                char c = 0;
                for (int i = 0; i < a; i++) {
                    if (amafVar2.a.contains(amaf.c(i, "created"))) {
                        f.h(AccountId.b(i));
                    }
                }
                amru g = f.g();
                int i2 = ((amvj) g).c;
                int i3 = 0;
                while (i3 < i2) {
                    AccountId accountId = (AccountId) g.get(i3);
                    String[] strArr = new String[12];
                    strArr[c] = "display_name";
                    strArr[1] = "account_name";
                    strArr[2] = "effective_gaia_id";
                    strArr[3] = "gaia_id";
                    strArr[4] = "profile_photo_url";
                    strArr[5] = "is_managed_account";
                    strArr[6] = "display_name";
                    strArr[7] = "avatar_url";
                    strArr[8] = "gaia_id";
                    strArr[9] = "email_gaia_id";
                    amru amruVar = g;
                    strArr[10] = "logged_in";
                    int i4 = i2;
                    strArr[11] = "logged_out";
                    amaj amajVar3 = amajVar2;
                    amal amalVar3 = amalVar2;
                    int i5 = 0;
                    while (i5 < 12) {
                        amafVar2.b.add(amaf.d(accountId, strArr[i5]));
                        i5++;
                        strArr = strArr;
                    }
                    aong aongVar = (aong) alym.a.createBuilder();
                    aongVar.copyOnWrite();
                    alym alymVar = (alym) aongVar.instance;
                    alymVar.b |= 256;
                    alymVar.i = "google";
                    if (amafVar2.e(accountId, "is_managed_account")) {
                        aongVar.copyOnWrite();
                        alym alymVar2 = (alym) aongVar.instance;
                        alymVar2.b |= 64;
                        alymVar2.g = true;
                        String b = amafVar2.b(accountId, "account_name");
                        aongVar.copyOnWrite();
                        alym alymVar3 = (alym) aongVar.instance;
                        b.getClass();
                        alymVar3.b |= 16;
                        alymVar3.e = b;
                        String b2 = amafVar2.b(accountId, "display_name");
                        aongVar.copyOnWrite();
                        alym alymVar4 = (alym) aongVar.instance;
                        b2.getClass();
                        alymVar4.b |= 2;
                        alymVar4.d = b2;
                        String b3 = amafVar2.b(accountId, "effective_gaia_id");
                        aongVar.copyOnWrite();
                        alym alymVar5 = (alym) aongVar.instance;
                        b3.getClass();
                        alymVar5.b |= 1;
                        alymVar5.c = b3;
                        String b4 = amafVar2.b(accountId, "gaia_id");
                        aongVar.copyOnWrite();
                        alym alymVar6 = (alym) aongVar.instance;
                        b4.getClass();
                        alymVar6.b |= 128;
                        alymVar6.h = b4;
                        String b5 = amafVar2.b(accountId, "avatar_url");
                        if (b5 != null) {
                            aongVar.copyOnWrite();
                            alym alymVar7 = (alym) aongVar.instance;
                            alymVar7.b |= 32;
                            alymVar7.f = b5;
                        }
                        c = 0;
                    } else {
                        String b6 = amafVar2.b(accountId, "account_name");
                        aongVar.copyOnWrite();
                        alym alymVar8 = (alym) aongVar.instance;
                        b6.getClass();
                        alymVar8.b |= 16;
                        alymVar8.e = b6;
                        int i6 = 2;
                        c = 0;
                        String[] strArr2 = {"display_name", "account_name"};
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                str = null;
                                break;
                            }
                            str = amafVar2.b(accountId, strArr2[i7]);
                            if (str != null) {
                                break;
                            }
                            i7++;
                            i6 = 2;
                        }
                        aongVar.copyOnWrite();
                        alym alymVar9 = (alym) aongVar.instance;
                        str.getClass();
                        alymVar9.b |= 2;
                        alymVar9.d = str;
                        String b7 = amafVar2.b(accountId, "gaia_id");
                        aongVar.copyOnWrite();
                        alym alymVar10 = (alym) aongVar.instance;
                        b7.getClass();
                        alymVar10.b |= 1;
                        alymVar10.c = b7;
                        String b8 = amafVar2.b(accountId, "profile_photo_url");
                        if (b8 != null) {
                            aongVar.copyOnWrite();
                            alym alymVar11 = (alym) aongVar.instance;
                            alymVar11.b |= 32;
                            alymVar11.f = b8;
                        }
                    }
                    boolean e = amafVar2.e(accountId, "logged_in");
                    boolean e2 = amafVar2.e(accountId, "logged_out");
                    aone createBuilder = amao.a.createBuilder();
                    int a2 = accountId.a();
                    createBuilder.copyOnWrite();
                    amao amaoVar = (amao) createBuilder.instance;
                    amaoVar.b |= 1;
                    amaoVar.c = a2;
                    createBuilder.copyOnWrite();
                    amao amaoVar2 = (amao) createBuilder.instance;
                    alym alymVar12 = (alym) aongVar.build();
                    alymVar12.getClass();
                    amaoVar2.d = alymVar12;
                    amaoVar2.b |= 2;
                    int i8 = e ? 2 : e2 ? 3 : 1;
                    createBuilder.copyOnWrite();
                    amao amaoVar3 = (amao) createBuilder.instance;
                    amaoVar3.e = i8 - 1;
                    amaoVar3.b |= 4;
                    arrayList.add(anaf.O((amao) createBuilder.build()));
                    i3++;
                    amajVar2 = amajVar3;
                    amalVar2 = amalVar3;
                    g = amruVar;
                    i2 = i4;
                }
                return anaf.H(arrayList).a(amjk.g(new Callable() { // from class: amai
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        amal amalVar4 = amal.this;
                        amaf amafVar3 = amafVar2;
                        List list = arrayList;
                        aone builder = amalVar4.toBuilder();
                        int a3 = amafVar3.a();
                        builder.copyOnWrite();
                        amal amalVar5 = (amal) builder.instance;
                        amalVar5.b |= 1;
                        amalVar5.c = a3;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            amao amaoVar4 = (amao) anaf.W((anhy) it.next());
                            builder.G(amaoVar4.c, amaoVar4);
                        }
                        return (amal) builder.build();
                    }
                }), amajVar2.a);
            }
        }), amajVar.a);
    }

    @Override // defpackage.vez
    public final anhy c() {
        return anfq.h(anfq.i(this.c.b.submit(new amad(this, 0)), new aeds(anfq.h(this.c.c.a(), new akpw(10), angq.a), 2), angq.a), new amml() { // from class: amac
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                amae amaeVar = amae.this;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    amaeVar.a.set(new amaf(amaeVar.c.a.getSharedPreferences("accounts", 0)));
                }
                return bool;
            }
        }, this.c.b);
    }
}
