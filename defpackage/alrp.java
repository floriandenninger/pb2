package defpackage;

import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class alrp implements alrq {
    public final /* synthetic */ alrr a;
    private final /* synthetic */ int b;

    public /* synthetic */ alrp(alrr alrrVar, int i) {
        this.b = i;
        this.a = alrrVar;
    }

    @Override // defpackage.alrq
    public final void a() {
        int i = this.b;
        int i2 = 0;
        if (i == 0) {
            alrr alrrVar = this.a;
            while (i2 < alrrVar.a.getAttributeCount()) {
                if ("defaultErrorCode".equals(alrrVar.a.getAttributeName(i2))) {
                    alrrVar.b.a = Integer.valueOf(alrc.a(alrrVar.a.getAttributeValue(i2)));
                }
                i2++;
            }
            alrrVar.b("split-install-error", new alrp(alrrVar, 2));
            return;
        }
        if (i == 1) {
            alrr alrrVar2 = this.a;
            alrrVar2.b("split-install-errors", new alrp(alrrVar2, i2));
            return;
        }
        alrr alrrVar3 = this.a;
        String str = null;
        String str2 = null;
        for (int i3 = 0; i3 < alrrVar3.a.getAttributeCount(); i3++) {
            if ("module".equals(alrrVar3.a.getAttributeName(i3))) {
                str = alrrVar3.a.getAttributeValue(i3);
            }
            if ("errorCode".equals(alrrVar3.a.getAttributeName(i3))) {
                str2 = alrrVar3.a.getAttributeValue(i3);
            }
        }
        if (str == null || str2 == null) {
            throw new XmlPullParserException(String.format("'%s' element does not contain 'module'/'errorCode' attributes.", "split-install-error"), alrrVar3.a, null);
        }
        alrrVar3.b.b().put(str, Integer.valueOf(alrc.a(str2)));
        do {
        } while (alrrVar3.a.next() != 3);
    }
}
