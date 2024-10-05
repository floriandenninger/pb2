package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aooo implements aoow {
    public static final aooo a = new aooo(1);
    private final /* synthetic */ int b;

    public aooo(int i) {
        this.b = i;
    }

    @Override // defpackage.aoow
    public final boolean b(Class cls) {
        if (this.b != 0) {
            return aonm.class.isAssignableFrom(cls);
        }
        return false;
    }

    @Override // defpackage.aoow
    public final aoov a(Class cls) {
        if (this.b == 0) {
            throw new IllegalStateException("This should never be called.");
        }
        if (!aonm.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (aoov) aonm.getDefaultInstance(cls.asSubclass(aonm.class)).buildMessageInfo();
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
