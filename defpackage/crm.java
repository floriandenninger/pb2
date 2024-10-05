package defpackage;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crm extends cri {
    private static final UriMatcher a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public crm(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    private static final InputStream h(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // defpackage.cqw
    public final Class a() {
        return InputStream.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[RETURN] */
    @Override // defpackage.cri
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object f(android.net.Uri r3, android.content.ContentResolver r4) {
        /*
            r2 = this;
            android.content.UriMatcher r0 = defpackage.crm.a
            int r0 = r0.match(r3)
            r1 = 1
            if (r0 == r1) goto L19
            r1 = 3
            if (r0 == r1) goto L14
            r1 = 5
            if (r0 == r1) goto L19
            java.io.InputStream r4 = r4.openInputStream(r3)
            goto L23
        L14:
            java.io.InputStream r4 = h(r4, r3)
            goto L23
        L19:
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.lookupContact(r4, r3)
            if (r0 == 0) goto L4b
            java.io.InputStream r4 = h(r4, r0)
        L23:
            if (r4 == 0) goto L26
            return r4
        L26:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 24
            r1.<init>(r0)
            java.lang.String r0 = "InputStream is null for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
        L4b:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.String r4 = "Contact cannot be found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crm.f(android.net.Uri, android.content.ContentResolver):java.lang.Object");
    }

    @Override // defpackage.cri
    protected final /* synthetic */ void g(Object obj) {
        ((InputStream) obj).close();
    }
}
