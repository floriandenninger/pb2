package defpackage;

import com.google.android.libraries.elements.interfaces.PublicKeyVerifier;
import io.grpc.Status;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajfw extends PublicKeyVerifier {
    private ankf a;
    private String b;
    private ankf c;

    @Override // com.google.android.libraries.elements.interfaces.PublicKeyVerifier
    public final Status initialize(String str, byte[] bArr, byte[] bArr2) {
        ankf ankfVar;
        try {
            anpw.a();
            this.a = (ankf) anjv.c(anji.a(bArr)).b(ankf.class);
            this.b = str;
            awxd awxdVar = (awxd) aonm.parseFrom(awxd.a, bArr2, aomw.b());
            if ((awxdVar.b & 1) == 0) {
                throw new GeneralSecurityException("Missing signed_keyset");
            }
            awxf awxfVar = awxdVar.c;
            if (awxfVar == null) {
                awxfVar = awxf.a;
            }
            int i = awxfVar.b;
            if ((i & 2) == 0) {
                throw new GeneralSecurityException("Missing signedKeyset.keyset");
            }
            if ((i & 1) != 0) {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                if ((awxfVar.b & 8) != 0) {
                    aoqa aoqaVar = awxfVar.e;
                    if (aoqaVar == null) {
                        aoqaVar = aoqa.a;
                    }
                    if (currentTimeMillis < aoqaVar.b) {
                        aoqa aoqaVar2 = awxfVar.e;
                        if (aoqaVar2 == null) {
                            aoqaVar2 = aoqa.a;
                        }
                        long j = aoqaVar2.b;
                        StringBuilder sb = new StringBuilder(137);
                        sb.append("Expired certificate: current time is before signed_keyset validity period. now = ");
                        sb.append(currentTimeMillis);
                        sb.append(", valid_after = ");
                        sb.append(j);
                        throw new GeneralSecurityException(sb.toString());
                    }
                }
                if ((awxfVar.b & 4) != 0) {
                    aoqa aoqaVar3 = awxfVar.d;
                    if (aoqaVar3 == null) {
                        aoqaVar3 = aoqa.a;
                    }
                    if (currentTimeMillis > aoqaVar3.b) {
                        aoqa aoqaVar4 = awxfVar.d;
                        if (aoqaVar4 == null) {
                            aoqaVar4 = aoqa.a;
                        }
                        long j2 = aoqaVar4.b;
                        StringBuilder sb2 = new StringBuilder(139);
                        sb2.append("Expired certificate: current time has passed signed_keyset validity period. now = ");
                        sb2.append(currentTimeMillis);
                        sb2.append(", valid_before = ");
                        sb2.append(j2);
                        throw new GeneralSecurityException(sb2.toString());
                    }
                }
                if (awxdVar.d.size() > 0) {
                    Iterator it = awxdVar.d.iterator();
                    while (it.hasNext()) {
                        int i2 = ((awxe) it.next()).b;
                        if ((i2 & 1) == 0 || (i2 & 2) == 0) {
                            throw new GeneralSecurityException("Missing Signature or Signature Identifier");
                        }
                    }
                    awxf awxfVar2 = awxdVar.c;
                    if (awxfVar2 == null) {
                        awxfVar2 = awxf.a;
                    }
                    byte[] byteArray = awxfVar2.toByteArray();
                    for (awxe awxeVar : awxdVar.d) {
                        if (awxeVar.d.equals(this.b) && (ankfVar = this.a) != null) {
                            ankfVar.a(awxeVar.c.I(), byteArray);
                            awxf awxfVar3 = awxdVar.c;
                            if (awxfVar3 == null) {
                                awxfVar3 = awxf.a;
                            }
                            this.c = (ankf) anjv.c(anji.a(awxfVar3.c.I())).b(ankf.class);
                            return Status.b;
                        }
                    }
                    throw new GeneralSecurityException("Intermediate certificate not signed by known root certificate");
                }
                throw new GeneralSecurityException("No Signatures found");
            }
            throw new GeneralSecurityException("Missing signedKeyset.identifier");
        } catch (IOException e) {
            String message = e.getMessage();
            return message != null ? Status.o.withDescription(message) : Status.o;
        } catch (GeneralSecurityException e2) {
            String message2 = e2.getMessage();
            return message2 != null ? Status.o.withDescription(message2) : Status.o;
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.PublicKeyVerifier
    public final Status verify(byte[] bArr, byte[] bArr2) {
        ankf ankfVar = this.c;
        if (ankfVar != null) {
            try {
                ankfVar.a(bArr, bArr2);
                return Status.b;
            } catch (GeneralSecurityException e) {
                String message = e.getMessage();
                if (message != null) {
                    return Status.i.withDescription(message);
                }
                return Status.i;
            }
        }
        return Status.o.withDescription("Intermediate verifier not available.");
    }
}
