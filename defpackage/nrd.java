package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nrd implements ajol {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ nrd(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.ajol
    public final void a(ajok ajokVar, ajng ajngVar, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            String str = this.a;
            HashMap hashMap = new HashMap();
            hashMap.put("engagement_panel_id_key", str);
            ajokVar.g(hashMap);
            return;
        }
        if (i2 == 1) {
            String str2 = this.a;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("engagement_panel_id_key", str2);
            ajokVar.g(hashMap2);
            return;
        }
        String str3 = this.a;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("engagement_panel_id_key", str3);
        ajokVar.g(hashMap3);
    }
}
