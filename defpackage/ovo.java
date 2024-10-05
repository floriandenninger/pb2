package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ovo extends aonm implements aooz {
    public static final ovo a;
    private static volatile aopf m;
    public int b;
    public int c;
    public int e;
    public long f;
    public long h;
    public int i;
    public boolean j;
    public long k;
    public long l;
    public String d = "";
    public String g = "";

    static {
        ovo ovoVar = new ovo();
        a = ovoVar;
        aonm.registerDefaultInstance(ovo.class, ovoVar);
    }

    private ovo() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဃ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဌ\u0007\bဇ\b\tဂ\t\nဂ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", dvg.j, "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new ovo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (ovo.class) {
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
