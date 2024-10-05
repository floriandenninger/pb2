package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aagc implements tmh {
    private final azrw a;
    private final azrw b;
    private final vgz c;

    public aagc(azrw azrwVar, vgz vgzVar, azrw azrwVar2) {
        this.a = azrwVar;
        this.c = vgzVar;
        this.b = azrwVar2;
    }

    @Override // defpackage.tmh
    public final void a(final String str, final long j, final int i, ammv ammvVar) {
        if (((Boolean) this.a.get()).booleanValue()) {
            ynm.m(this.c.b(new amml() { // from class: aagb
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    aagc aagcVar = aagc.this;
                    String str2 = str;
                    long j2 = j;
                    int i2 = i;
                    ttz ttzVar = (ttz) obj;
                    aoot aootVar = ttzVar.b;
                    boolean z = j2 != (aootVar.containsKey(str2) ? ((Long) aootVar.get(str2)).longValue() : -1L);
                    aagcVar.b(str2, j2, i2, z);
                    if (!z) {
                        return ttzVar;
                    }
                    aone builder = ttzVar.toBuilder();
                    builder.copyOnWrite();
                    ((ttz) builder.instance).a().remove(str2);
                    builder.copyOnWrite();
                    ((ttz) builder.instance).a().put(str2, Long.valueOf(j2));
                    return (ttz) builder.build();
                }
            }, angq.a), new ynk() { // from class: aaga
                @Override // defpackage.zfi
                /* renamed from: b */
                public final void a(Throwable th) {
                    aagc.this.b(str, j, i, false);
                }
            });
        }
    }

    public final void b(String str, long j, int i, boolean z) {
        tmf tmfVar = new tmf();
        tmfVar.a = true;
        tmfVar.b = true;
        tmfVar.c = false;
        Boolean bool = tmfVar.a;
        if (bool == null || tmfVar.b == null || tmfVar.c == null) {
            StringBuilder sb = new StringBuilder();
            if (tmfVar.a == null) {
                sb.append(" requiresDeviceIdle");
            }
            if (tmfVar.b == null) {
                sb.append(" requiresCharging");
            }
            if (tmfVar.c == null) {
                sb.append(" requiresBatteryNotLow");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        tmg tmgVar = new tmg(bool.booleanValue(), tmfVar.b.booleanValue(), tmfVar.c.booleanValue());
        Bundle bundle = new Bundle();
        bundle.putString("MDD_TASK_TAG_KEY", str);
        ((ylf) this.b.get()).d(str, j, j, z, i == 1 ? 1 : i == 2 ? 2 : 0, tmgVar.a, bundle, null);
    }
}
