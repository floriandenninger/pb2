package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apxs extends aonm implements aooz {
    public static final apxs a;
    private static volatile aopf k;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    private int l;

    static {
        apxs apxsVar = new apxs();
        a = apxsVar;
        aonm.registerDefaultInstance(apxs.class, apxsVar);
    }

    private apxs() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u000b\u001f\t\u0000\u0000\u0000\u000bဇ\u0007\u0012ဇ\u000e\u0015ဇ\u0011\u0016ဇ\u0014\u0018ဇ\u0012\u0019ဇ\u0013\u001aဇ\u0016\u001dဇ\u001b\u001fဇ\u001c", new Object[]{"l", "b", "c", "d", "g", "e", "f", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new apxs();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (apxs.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
