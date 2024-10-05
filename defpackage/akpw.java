package defpackage;

import android.content.Intent;
import com.google.apps.tiktok.account.api.controller.AccountActionResult;
import com.google.apps.tiktok.account.api.controller.ValidationResult;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class akpw implements amml {
    private final /* synthetic */ int n;
    public static final /* synthetic */ akpw m = new akpw(14);
    public static final /* synthetic */ akpw l = new akpw(13);
    public static final /* synthetic */ akpw k = new akpw(12);
    public static final /* synthetic */ akpw j = new akpw(9);
    public static final /* synthetic */ akpw i = new akpw(8);
    public static final /* synthetic */ akpw h = new akpw(7);
    public static final /* synthetic */ akpw g = new akpw(6);
    public static final /* synthetic */ akpw f = new akpw(5);
    public static final /* synthetic */ akpw e = new akpw(4);
    public static final /* synthetic */ akpw d = new akpw(3);
    public static final /* synthetic */ akpw c = new akpw(2);
    public static final /* synthetic */ akpw b = new akpw(1);
    public static final /* synthetic */ akpw a = new akpw(0);

    public /* synthetic */ akpw(int i2) {
        this.n = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.n) {
            case 0:
                return ((aksi) obj).h;
            case 1:
                aqyg aqygVar = ((atnz) obj).c;
                return aqygVar == null ? aqyg.a : aqygVar;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    return ValidationResult.d();
                }
                throw new alww();
            case 3:
                throw new alww();
            case 4:
                ValidationResult validationResult = (ValidationResult) obj;
                return validationResult == null ? ValidationResult.d() : validationResult;
            case 5:
                return new AccountActionResult(null, alym.a, null, (Intent) obj);
            case 6:
                alyk alykVar = (alyk) obj;
                amkq.E(alykVar.c == 2);
                return alykVar;
            case 7:
                aone builder = ((alzi) obj).toBuilder();
                builder.clear();
                return (alzi) builder.build();
            case 8:
                amrp f2 = amru.f();
                Iterator it = Collections.unmodifiableMap(((amal) obj).d).values().iterator();
                while (it.hasNext()) {
                    f2.h(alzp.a((amao) it.next()));
                }
                return f2.g();
            case 9:
                amrp f3 = amru.f();
                for (amao amaoVar : Collections.unmodifiableMap(((amal) obj).d).values()) {
                    int w = alta.w(amaoVar.e);
                    if (w != 0 && w == 2) {
                        f3.h(alzp.a(amaoVar));
                    }
                }
                return f3.g();
            case 10:
                return Boolean.valueOf(!(((aman) obj).b.containsKey("accountmanager") ? ((Boolean) r7.get("accountmanager")).booleanValue() : false));
            case 11:
                aone builder2 = ((aman) obj).toBuilder();
                builder2.copyOnWrite();
                aman amanVar = (aman) builder2.instance;
                aoot aootVar = amanVar.b;
                if (!aootVar.b) {
                    amanVar.b = aootVar.a();
                }
                amanVar.b.put("accountmanager", true);
                return (aman) builder2.build();
            case 12:
                return null;
            case 13:
                HashSet hashSet = new HashSet();
                for (alyk alykVar2 : (List) obj) {
                    if (!alykVar2.b.i.equals("incognito")) {
                        hashSet.add(alykVar2.a);
                    }
                }
                return hashSet;
            default:
                return abd.h();
        }
    }
}
