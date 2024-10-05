package defpackage;

import android.os.Parcel;
import com.google.android.gms.cast.LaunchOptions;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qga extends ecq implements qgb {
    final /* synthetic */ qfy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qga(qfy qfyVar) {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
        this.a = qfyVar;
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        final int i3 = 1;
        if (i != 1) {
            final int i4 = 0;
            if (i == 2) {
                final String readString = parcel.readString();
                final LaunchOptions launchOptions = (LaunchOptions) ecr.a(parcel, LaunchOptions.CREATOR);
                qog qogVar = this.a.c;
                if (qogVar != null) {
                    qrd b = qre.b();
                    final qfe qfeVar = (qfe) qogVar;
                    b.a = new qqu() { // from class: qew
                        @Override // defpackage.qqu
                        public final void a(Object obj, Object obj2) {
                            qfe qfeVar2 = qfe.this;
                            String str = readString;
                            LaunchOptions launchOptions2 = launchOptions;
                            qfeVar2.g();
                            qkr qkrVar = (qkr) ((qkn) obj).D();
                            Parcel pn = qkrVar.pn();
                            pn.writeString(str);
                            ecr.g(pn, launchOptions2);
                            qkrVar.pq(13, pn);
                            qfeVar2.i((rpv) obj2);
                        }
                    };
                    b.c = 8406;
                    ((qob) qogVar).w(b.a()).q(new rpi(this) { // from class: qfv
                        public final /* synthetic */ qga a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.rpi
                        public final void a(rpt rptVar) {
                            if (i4 != 0) {
                                this.a.a.l(rptVar);
                            } else {
                                this.a.a.l(rptVar);
                            }
                        }
                    });
                }
                parcel2.writeNoException();
            } else if (i == 3) {
                final String readString2 = parcel.readString();
                qog qogVar2 = this.a.c;
                if (qogVar2 != null) {
                    qrd b2 = qre.b();
                    final qfe qfeVar2 = (qfe) qogVar2;
                    b2.a = new qqu() { // from class: qeu
                        @Override // defpackage.qqu
                        public final void a(Object obj, Object obj2) {
                            qfe qfeVar3 = qfe.this;
                            String str = readString2;
                            qfeVar3.g();
                            qkr qkrVar = (qkr) ((qkn) obj).D();
                            Parcel pn = qkrVar.pn();
                            pn.writeString(str);
                            qkrVar.pq(5, pn);
                            synchronized (qfeVar3.i) {
                                if (qfeVar3.f == null) {
                                    qfeVar3.f = (rpv) obj2;
                                } else {
                                    ((rpv) obj2).a(qfe.f(2001));
                                }
                            }
                        }
                    };
                    b2.c = 8409;
                    ((qob) qogVar2).w(b2.a());
                }
                parcel2.writeNoException();
            } else if (i == 4) {
                this.a.d(parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i != 5) {
                    return false;
                }
                parcel2.writeNoException();
                parcel2.writeInt(213880000);
            }
        } else {
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            qog qogVar3 = this.a.c;
            if (qogVar3 != null) {
                qrd b3 = qre.b();
                b3.a = new qex((qfe) qogVar3, readString3, readString4, 1);
                b3.c = 8407;
                ((qob) qogVar3).w(b3.a()).q(new rpi(this) { // from class: qfv
                    public final /* synthetic */ qga a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.rpi
                    public final void a(rpt rptVar) {
                        if (i3 != 0) {
                            this.a.a.l(rptVar);
                        } else {
                            this.a.a.l(rptVar);
                        }
                    }
                });
            }
            parcel2.writeNoException();
        }
        return true;
    }

    public qga() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }
}
