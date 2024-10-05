package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqrt extends aonm implements aooz {
    public static final aqrt a;
    private static volatile aopf m;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;

    static {
        aqrt aqrtVar = new aqrt();
        a = aqrtVar;
        aonm.registerDefaultInstance(aqrt.class, aqrtVar);
    }

    private aqrt() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\b\u001d\n\u0000\u0000\u0000\bဇ\u0003\u000bဇ\u0005\u0014ဇ\r\u0015ဇ\u000e\u0016ဇ\u000f\u0017ဂ\u0010\u0018ဇ\u0011\u0019ဇ\u0012\u001cဇ\u0015\u001dဇ\u0016", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new aqrt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (aqrt.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
