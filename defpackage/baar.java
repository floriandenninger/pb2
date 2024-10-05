package defpackage;

import com.google.android.youtube.R;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baar implements skd {
    private final /* synthetic */ int a;

    public baar(int i) {
        this.a = i;
    }

    @Override // defpackage.skd
    public final int a() {
        return this.a != 0 ? 165418773 : -1232518371;
    }

    @Override // defpackage.skd
    public final int b() {
        return this.a != 0 ? R.raw.logs_proto_contacts_obake_extension_proto_cb : R.raw.logs_proto_identity_boq_oauth_integrations_client_extension_collection_basis_library;
    }

    public final String toString() {
        return this.a != 0 ? "java_hash=165418773,feature_hash=-2032180703,res=2131951683" : "java_hash=-1232518371,feature_hash=-2032180703,res=2131951684";
    }

    public final boolean equals(Object obj) {
        if (this.a != 0) {
            if (obj != null && getClass() == obj.getClass()) {
                skd skdVar = (skd) obj;
                if (skdVar.a() == 165418773 && skdVar.b() == R.raw.logs_proto_contacts_obake_extension_proto_cb) {
                    return true;
                }
            }
            return false;
        }
        if (obj != null && getClass() == obj.getClass()) {
            skd skdVar2 = (skd) obj;
            if (skdVar2.a() == -1232518371 && skdVar2.b() == R.raw.logs_proto_identity_boq_oauth_integrations_client_extension_collection_basis_library) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.a == 0) {
            return Arrays.hashCode(new int[]{getClass().hashCode(), -1232518371, -2032180703, R.raw.logs_proto_identity_boq_oauth_integrations_client_extension_collection_basis_library});
        }
        return Arrays.hashCode(new int[]{getClass().hashCode(), 165418773, -2032180703, R.raw.logs_proto_contacts_obake_extension_proto_cb});
    }
}
