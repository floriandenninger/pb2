package defpackage;

import android.util.Log;
import java.net.ProtocolException;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acbh implements Runnable {
    final /* synthetic */ acbp a;

    public acbh(acbp acbpVar) {
        this.a = acbpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            acbp acbpVar = this.a;
            while (!acbpVar.c) {
                byte a = acbpVar.a();
                int i = (a >> 6) & 3;
                int i2 = a & 63;
                int i3 = acbq.a;
                if (i2 == 0) {
                    i2 = acbq.a(acbpVar.a());
                } else if (i2 == 1) {
                    i2 = acbq.a(acbpVar.a()) + (acbpVar.a() * 256);
                }
                acbm acbmVar = (acbm) acbpVar.d.get(i2);
                if (acbmVar == null) {
                    acbmVar = new acbm();
                    acbmVar.a = i2;
                    acbmVar.d = -1;
                    acbmVar.c = -1;
                    acbmVar.h = -1L;
                    acbmVar.e = -1;
                    acbmVar.b = -1;
                    acbpVar.d.put(i2, acbmVar);
                }
                if (i == 0) {
                    acbpVar.k(acbpVar.a, 0, 11);
                    int b = acbq.b(acbpVar.a, 0);
                    if (acbq.c(b)) {
                        b = acbpVar.d();
                    }
                    acbmVar.h = b;
                    acbmVar.e = 0;
                    acbmVar.b = acbq.b(acbpVar.a, 3);
                    acbmVar.c = acbpVar.a.get(6) & 255;
                    acbmVar.d = (acbpVar.a.get(7) & 255) | ((acbpVar.a.get(8) & 255) << 8) | ((acbpVar.a.get(9) & 255) << 16) | (acbpVar.a.get(10) << 24);
                } else if (i == 1) {
                    acbpVar.k(acbpVar.a, 0, 7);
                    if (acbmVar.d < 0) {
                        throw new ProtocolException("Missing message stream ID from earlier chunk");
                    }
                    if (acbmVar.h < 0) {
                        throw new ProtocolException("Missing timestamp from earlier chunk");
                    }
                    int b2 = acbq.b(acbpVar.a, 0);
                    if (acbq.c(b2)) {
                        b2 = acbpVar.d();
                    }
                    acbmVar.e = b2;
                    acbmVar.h += b2;
                    acbmVar.b = acbq.b(acbpVar.a, 3);
                    acbmVar.c = acbpVar.a.get(6) & 255;
                } else if (i == 2) {
                    acbpVar.k(acbpVar.a, 0, 3);
                    if (acbmVar.d < 0) {
                        throw new ProtocolException("Missing message stream ID from earlier chunk");
                    }
                    if (acbmVar.c < 0) {
                        throw new ProtocolException("Missing message type ID from earlier chunk");
                    }
                    if (acbmVar.h < 0) {
                        throw new ProtocolException("Missing timestamp from earlier chunk");
                    }
                    if (acbmVar.b < 0) {
                        throw new ProtocolException("Missing length from earlier chunk");
                    }
                    int b3 = acbq.b(acbpVar.a, 0);
                    acbmVar.e = b3;
                    acbmVar.h += b3;
                } else {
                    if (acbmVar.d < 0) {
                        throw new ProtocolException("Missing message stream ID from earlier chunk");
                    }
                    if (acbmVar.c < 0) {
                        throw new ProtocolException("Missing message type ID from earlier chunk");
                    }
                    long j = acbmVar.h;
                    if (j < 0) {
                        throw new ProtocolException("Missing timestamp from earlier chunk");
                    }
                    int i4 = acbmVar.e;
                    if (i4 < 0) {
                        throw new ProtocolException("Missing timestamp delta from earlier chunk");
                    }
                    if (acbmVar.b < 0) {
                        throw new ProtocolException("Missing length from earlier chunk");
                    }
                    acbmVar.h = j + i4;
                }
                int i5 = 5;
                if (acbmVar.f) {
                    i5 = acbpVar.b(acbmVar);
                } else if (acbmVar.a == 2 && acbmVar.d == 0) {
                    int i6 = acbmVar.c;
                    if (i6 == 1) {
                        int i7 = acbmVar.b;
                        if (i7 != 4) {
                            StringBuilder sb = new StringBuilder(54);
                            sb.append("Invalid message length for set chunk size: ");
                            sb.append(i7);
                            throw new ProtocolException(sb.toString());
                        }
                        int d = acbpVar.d();
                        acbpVar.e = d;
                        if (!acbq.d(d)) {
                            int i8 = acbpVar.e;
                            StringBuilder sb2 = new StringBuilder(31);
                            sb2.append("Invalid chunk size: ");
                            sb2.append(i8);
                            throw new ProtocolException(sb2.toString());
                        }
                        acbpVar.f = ByteBuffer.allocate(acbpVar.e);
                    } else if (i6 == 2) {
                        int i9 = acbmVar.b;
                        if (i9 != 4) {
                            StringBuilder sb3 = new StringBuilder(45);
                            sb3.append("Invalid message length for abort: ");
                            sb3.append(i9);
                            throw new ProtocolException(sb3.toString());
                        }
                        acbm acbmVar2 = (acbm) acbpVar.d.get(acbpVar.d());
                        if (acbmVar2 == null) {
                            Log.e("RtmpInputStream", "Ignoring request to abort unrecognized message");
                        } else {
                            acbmVar2.f = true;
                        }
                    } else if (i6 == 3) {
                        int i10 = acbmVar.b;
                        if (i10 != 4) {
                            StringBuilder sb4 = new StringBuilder(43);
                            sb4.append("Invalid message length for ack: ");
                            sb4.append(i10);
                            throw new ProtocolException(sb4.toString());
                        }
                        acbpVar.i(acbpVar.d());
                    } else if (i6 == 5) {
                        int i11 = acbmVar.b;
                        if (i11 != 4) {
                            StringBuilder sb5 = new StringBuilder(55);
                            sb5.append("Invalid message length for window ack size: ");
                            sb5.append(i11);
                            throw new ProtocolException(sb5.toString());
                        }
                        acbpVar.j = acbpVar.d();
                    } else if (i6 != 6) {
                        StringBuilder sb6 = new StringBuilder(47);
                        sb6.append("Skipping unrecognized message type: ");
                        sb6.append(i6);
                        Log.e("RtmpInputStream", sb6.toString());
                        i5 = acbpVar.b(acbmVar);
                    } else {
                        int i12 = acbmVar.b;
                        if (i12 != 5) {
                            StringBuilder sb7 = new StringBuilder(58);
                            sb7.append("Invalid message length for set peer bandwidth: ");
                            sb7.append(i12);
                            throw new ProtocolException(sb7.toString());
                        }
                        acbpVar.j(acbpVar.d(), acbpVar.a());
                    }
                    i5 = 4;
                } else {
                    int i13 = acbmVar.c;
                    if (i13 == 20) {
                        i5 = acbpVar.c(acbmVar);
                    } else {
                        StringBuilder sb8 = new StringBuilder(43);
                        sb8.append("Skipping unknown message: type= ");
                        sb8.append(i13);
                        Log.e("RtmpInputStream", sb8.toString());
                        i5 = acbpVar.b(acbmVar);
                    }
                }
                acbpVar.m(i5);
            }
            synchronized (this.a.k) {
                this.a.b = null;
            }
        } catch (Throwable th) {
            try {
                if (!this.a.c) {
                    Log.e("RtmpInputStream", "Unexpected throwable in reader loop", th);
                    this.a.h(th);
                }
                synchronized (this.a.k) {
                    this.a.b = null;
                }
            } catch (Throwable th2) {
                synchronized (this.a.k) {
                    this.a.b = null;
                    throw th2;
                }
            }
        }
    }
}
