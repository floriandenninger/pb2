package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$ApiNotConnectedException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$DeveloperErrorException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader$MdiException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ulm {
    public final tuh a;
    public final ujn b;
    public final String c;
    private final uke d;

    public ulm(Context context, tuh tuhVar, uke ukeVar, ujn ujnVar) {
        this.a = tuhVar;
        this.d = ukeVar;
        this.b = ujnVar;
        this.c = context.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anhy a(final amml ammlVar) {
        return amkq.n(this.d.a(), new anfz() { // from class: ulk
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                final ulm ulmVar = ulm.this;
                amml ammlVar2 = ammlVar;
                final List list = (List) obj;
                final ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((anhy) ammlVar2.apply(ulmVar.a.a((Account) it.next())));
                }
                return amkq.j(arrayList).a(new Callable() { // from class: ull
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ujn ujnVar;
                        String str;
                        aodx aodxVar;
                        ulm ulmVar2 = ulm.this;
                        List list2 = list;
                        List list3 = arrayList;
                        int size = list2.size();
                        amrp h = amru.h(size);
                        boolean z = false;
                        for (int i = 0; i < size; i++) {
                            ukh a = uki.a();
                            a.b(((Account) list2.get(i)).name);
                            anhy anhyVar = (anhy) list3.get(i);
                            amkq.N(anhyVar.isDone());
                            String str2 = "OK";
                            try {
                                try {
                                    aodxVar = (aodx) anhs.a(anhyVar, MdiOwnersLoader$MdiException.class);
                                } catch (Throwable th) {
                                    ulmVar2.b.a("OK", ulmVar2.c);
                                    throw th;
                                }
                            } catch (aniv e) {
                                e = e;
                            } catch (MdiOwnersLoader$MdiException e2) {
                                e = e2;
                            }
                            if (aodxVar == null) {
                                str2 = "Absent";
                                a.e(z);
                                ujnVar = ulmVar2.b;
                                str = ulmVar2.c;
                            } else if (aodxVar.b.size() <= 0) {
                                Log.e("OneGoogle", "GetPeopleResponse contains no persons");
                                ulmVar2.b.a("NoPerson", ulmVar2.c);
                                h.h(a.a());
                            } else {
                                alvz alvzVar = ((aody) aodxVar.b.get(z ? 1 : 0)).b;
                                if (alvzVar == null) {
                                    alvzVar = alvz.a;
                                }
                                if (alvzVar.d.size() > 0) {
                                    alwd alwdVar = (alwd) alvzVar.d.get(z ? 1 : 0);
                                    a.d = alwdVar.c;
                                    try {
                                        a.d(new aonw(alwdVar.d, alwd.a).contains(alwb.GOOGLE_ONE_USER));
                                        a.h = true != new aonw(alwdVar.d, alwd.a).contains(alwb.GOOGLE_FAMILY_CHILD_USER) ? 3 : 2;
                                        a.c(new aonw(alwdVar.d, alwd.a).contains(alwb.GOOGLE_APPS_USER));
                                    } catch (aniv | MdiOwnersLoader$MdiException e3) {
                                        e = e3;
                                        z = false;
                                        Throwable cause = e.getCause();
                                        str2 = tyo.U(cause);
                                        qnx qnxVar = (qnx) tyo.V(cause, qnx.class);
                                        if (qnxVar != null) {
                                            int a2 = qnxVar.a();
                                            StringBuilder sb = new StringBuilder(24);
                                            sb.append("ApiException-");
                                            sb.append(a2);
                                            str2 = sb.toString();
                                            if (a2 == 17) {
                                                throw new ExecutionException(new MdiNotAvailableException$ApiNotConnectedException(cause));
                                            }
                                            if (a2 == 10) {
                                                throw new ExecutionException(new MdiNotAvailableException$DeveloperErrorException(cause));
                                            }
                                        }
                                        Log.e("OneGoogle", "Failed to load profile data", e);
                                        ujnVar = ulmVar2.b;
                                        str = ulmVar2.c;
                                        ujnVar.a(str2, str);
                                        h.h(a.a());
                                    }
                                }
                                if (alvzVar.b.size() > 0) {
                                    alvy alvyVar = (alvy) alvzVar.b.get(0);
                                    int i2 = alvyVar.b;
                                    a.a = (i2 & 2) != 0 ? alvyVar.c : null;
                                    a.b = (i2 & 16) != 0 ? alvyVar.d : null;
                                    a.c = (i2 & 32) != 0 ? alvyVar.e : null;
                                }
                                alwc an = rwh.an(aodxVar);
                                if (an != null) {
                                    if (an.e) {
                                        a.f = an.d;
                                    } else {
                                        a.e = an.d;
                                    }
                                }
                                if (alvzVar.e.size() == 1) {
                                    z = false;
                                    z = false;
                                    z = false;
                                    z = false;
                                    int b = ambh.b(((alvx) alvzVar.e.get(0)).b);
                                    if (b == 0 || b == 1) {
                                        a.g = 1;
                                    } else if (b == 2) {
                                        a.g = 2;
                                    } else if (b != 4) {
                                        a.g = 4;
                                    } else {
                                        a.g = 3;
                                    }
                                } else {
                                    z = false;
                                }
                                ujnVar = ulmVar2.b;
                                str = ulmVar2.c;
                            }
                            ujnVar.a(str2, str);
                            h.h(a.a());
                        }
                        return h.g();
                    }
                }, angq.a);
            }
        }, angq.a);
    }
}
