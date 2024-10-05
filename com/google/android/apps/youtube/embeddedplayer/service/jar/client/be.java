package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class be implements com.google.android.apps.youtube.embeddedplayer.service.jar.d {
    final /* synthetic */ bn a;

    public be(bn bnVar) {
        this.a = bnVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.d
    public final void a(int i) {
        if (i == 0 || i == 5) {
            final int i2 = 0;
            this.a.m.post(new Runnable(this) { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.bd
                public final /* synthetic */ be a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (i2 != 0) {
                        this.a.a.C.e();
                        return;
                    }
                    be beVar = this.a;
                    beVar.a.C.g();
                    beVar.a.B.g();
                }
            });
        } else {
            final int i3 = 1;
            if (i == 1) {
                this.a.m.post(new Runnable(this) { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.bd
                    public final /* synthetic */ be a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (i3 != 0) {
                            this.a.a.C.e();
                            return;
                        }
                        be beVar = this.a;
                        beVar.a.C.g();
                        beVar.a.B.g();
                    }
                });
            }
        }
    }
}
