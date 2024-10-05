package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public class acrd {
    public acra a = acra.l;
    public byte[] b;
    public asht c;

    public acrd() {
        Optional.empty();
    }

    public final void a(acra acraVar) {
        if (acraVar != null) {
            this.a = acraVar;
        } else {
            zga.b("Trying to set a null InteractionLogger!!  Assigning to no-op InteractionLogger instead");
            this.a = acra.l;
        }
    }
}
