package defpackage;

import android.content.Intent;
import android.util.Pair;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.AccountActionResult;
import com.google.apps.tiktok.account.api.controller.ValidationResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alyc {
    public final alyw a;
    public final Set b;
    private final Map c;
    private final Map d;
    private final alxe e;

    public alyc(alyw alywVar, Map map, Map map2, Set set, alxe alxeVar) {
        this.a = alywVar;
        this.c = map;
        this.d = map2;
        this.b = set;
        this.e = alxeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final anhy a(final alxo alxoVar, List list) {
        Object obj;
        ArrayList arrayList = new ArrayList(((amvj) list).c);
        amxe it = ((amru) list).iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (alxl.class.isAssignableFrom(cls)) {
                obj = this.c.get(cls);
            } else if (alxn.class.isAssignableFrom(cls)) {
                obj = this.d.get(cls);
            } else {
                String valueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("No selector registered for key: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            final azrw azrwVar = (azrw) obj;
            arrayList.add(new anfy() { // from class: alxy
                @Override // defpackage.anfy
                public final anhy a() {
                    azrw azrwVar2 = azrw.this;
                    alxo alxoVar2 = alxoVar;
                    final alxj alxjVar = (alxj) azrwVar2.get();
                    return anfq.h(alxjVar.a(alxoVar2), new amml() { // from class: alxw
                        @Override // defpackage.amml
                        public final Object apply(Object obj2) {
                            return Pair.create(alxj.this, obj2);
                        }
                    }, angq.a);
                }
            });
        }
        return anfq.i(alta.x(arrayList, akgg.j, angq.a), amjk.c(new anfz() { // from class: alxz
            @Override // defpackage.anfz
            public final anhy a(Object obj2) {
                final alyc alycVar = alyc.this;
                Pair pair = (Pair) obj2;
                if (pair != null) {
                    if (pair.first instanceof alxm) {
                        return anfq.h(((alxm) pair.first).b(), akpw.f, angq.a);
                    }
                    if (pair.first instanceof alxk) {
                        final AccountId accountId = (AccountId) pair.second;
                        final alxk alxkVar = (alxk) pair.first;
                        return anfq.i(alycVar.a.b(accountId), amjk.c(new anfz() { // from class: alyb
                            @Override // defpackage.anfz
                            public final anhy a(Object obj3) {
                                alyc alycVar2 = alyc.this;
                                alxk alxkVar2 = alxkVar;
                                AccountId accountId2 = accountId;
                                alyk alykVar = (alyk) obj3;
                                int i = 1;
                                if (!alycVar2.b.contains(alykVar.b.i)) {
                                    amkq.O(alykVar.c != 3, "Can't auto-select disabled accounts.");
                                }
                                return anfq.h(alxkVar2.b(accountId2), amjk.a(new alzn(accountId2, i)), angq.a);
                            }
                        }), angq.a);
                    }
                }
                return anaf.O(new AccountActionResult(null, alym.a, null, null));
            }
        }), angq.a);
    }

    public final amru b() {
        return this.e.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anhy c(final AccountId accountId, Intent intent) {
        return anfq.i(this.e.d(accountId, b(), intent), amjk.c(new anfz() { // from class: alya
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                alyc alycVar = alyc.this;
                AccountId accountId2 = accountId;
                final ValidationResult validationResult = (ValidationResult) obj;
                if (!validationResult.c()) {
                    amkq.N(!validationResult.c());
                    return anaf.O(new AccountActionResult(accountId2, alym.a, validationResult, null));
                }
                return anfq.h(alycVar.a.b(accountId2), amjk.a(new amml() { // from class: alxx
                    @Override // defpackage.amml
                    public final Object apply(Object obj2) {
                        ValidationResult validationResult2 = ValidationResult.this;
                        alyk alykVar = (alyk) obj2;
                        AccountId accountId3 = alykVar.a;
                        alym alymVar = alykVar.b;
                        amkq.O(validationResult2.c(), "Trying to propagate AccountInfo for invalid account.");
                        return new AccountActionResult(accountId3, alymVar, validationResult2, null);
                    }
                }), angq.a);
            }
        }), angq.a);
    }
}
