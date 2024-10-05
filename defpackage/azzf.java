package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azzf extends azta implements azyz, aztb {
    public final azyz a;
    public final azsv b;
    public final int c;
    private azsv d;
    private azsq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azzf(azyz azyzVar, azsv azsvVar) {
        super(azzd.a, azsw.a);
        azyzVar.getClass();
        this.a = azyzVar;
        this.b = azsvVar;
        this.c = ((Number) azsvVar.fold(0, azsu.d)).intValue();
    }

    @Override // defpackage.azyz
    public final Object emit(Object obj, azsq azsqVar) {
        Comparable comparable;
        try {
            azsv context = azsqVar.getContext();
            context.getClass();
            azxg azxgVar = (azxg) context.get(azxg.b);
            if (azxgVar != null && !azxgVar.l()) {
                throw azxgVar.h();
            }
            azsv azsvVar = this.d;
            if (azsvVar != context) {
                int i = 0;
                if (azsvVar instanceof azzc) {
                    String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((azzc) azsvVar).a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                    str.getClass();
                    List b = azuj.b(new azvc(new azve(str, new azvg(aype.h(new String[]{"\r\n", "\n", "\r"}))), new azvh(str)));
                    ArrayList<String> arrayList = new ArrayList();
                    for (Object obj2 : b) {
                        if (!azul.g((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(aype.f(arrayList));
                    for (String str2 : arrayList) {
                        int length = str2.length();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                i2 = -1;
                                break;
                            }
                            if (!azul.l(str2.charAt(i2))) {
                                break;
                            }
                            i2++;
                        }
                        if (i2 == -1) {
                            i2 = str2.length();
                        }
                        arrayList2.add(Integer.valueOf(i2));
                    }
                    Iterator it = arrayList2.iterator();
                    if (it.hasNext()) {
                        comparable = (Comparable) it.next();
                        while (it.hasNext()) {
                            Comparable comparable2 = (Comparable) it.next();
                            if (comparable.compareTo(comparable2) > 0) {
                                comparable = comparable2;
                            }
                        }
                    } else {
                        comparable = null;
                    }
                    Integer num = (Integer) comparable;
                    int intValue = num != null ? num.intValue() : 0;
                    int length2 = str.length();
                    b.size();
                    aztu azvfVar = "".length() == 0 ? azwi.b : new azvf();
                    int size = b.size() - 1;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : b) {
                        int i3 = i + 1;
                        if (i < 0) {
                            aype.d();
                        }
                        String str3 = (String) obj3;
                        if ((i == 0 || i == size) && azul.g(str3)) {
                            str3 = null;
                        } else {
                            str3.getClass();
                            if (intValue < 0) {
                                throw new IllegalArgumentException(("Requested character count " + intValue + " is less than zero.").toString());
                            }
                            String substring = str3.substring(azuj.d(intValue, str3.length()));
                            substring.getClass();
                            String str4 = (String) azvfVar.a(substring);
                            if (str4 != null) {
                                str3 = str4;
                            }
                        }
                        if (str3 != null) {
                            arrayList3.add(str3);
                        }
                        i = i3;
                    }
                    StringBuilder sb = new StringBuilder(length2);
                    aype.g(arrayList3, sb, "\n", "", "");
                    String sb2 = sb.toString();
                    sb2.getClass();
                    throw new IllegalStateException(sb2.toString());
                }
                context.getClass();
                if (((Number) context.fold(0, new azzg(this))).intValue() != this.c) {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
                this.d = context;
            }
            this.e = azsqVar;
            Object emit = this.a.emit(obj, this);
            azsx azsxVar = azsx.COROUTINE_SUSPENDED;
            return emit == azsx.COROUTINE_SUSPENDED ? emit : azsf.a;
        } catch (Throwable th) {
            this.d = new azzc(th);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [azsq, aztb] */
    @Override // defpackage.azsy, defpackage.aztb
    public final aztb getCallerFrame() {
        ?? r0 = this.e;
        if (r0 instanceof aztb) {
            return r0;
        }
        return null;
    }

    @Override // defpackage.azta, defpackage.azsq
    public final azsv getContext() {
        azsq azsqVar = this.e;
        azsv context = azsqVar == null ? null : azsqVar.getContext();
        return context == null ? azsw.a : context;
    }

    @Override // defpackage.azsy, defpackage.aztb
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.azsy
    public final Object invokeSuspend(Object obj) {
        Throwable a = azsb.a(obj);
        if (a != null) {
            this.d = new azzc(a);
        }
        azsq azsqVar = this.e;
        if (azsqVar != null) {
            azsqVar.resumeWith(obj);
        }
        return azsx.COROUTINE_SUSPENDED;
    }

    @Override // defpackage.azta, defpackage.azsy
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
