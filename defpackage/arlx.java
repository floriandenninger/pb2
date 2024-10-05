package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arlx extends aonm implements aooz {
    public static final arlx a;
    private static volatile aopf i;
    public int b;
    public Object d;
    public arnb e;
    private armd j;
    public int c = 0;
    private byte k = 2;
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        arlx arlxVar = new arlx();
        a = arlxVar;
        aonm.registerDefaultInstance(arlx.class, arlxVar);
    }

    private arlx() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ြ\u0000\u0007ြ\u0000\bᐉ\u0007", new Object[]{"d", "c", "b", "e", "f", "g", "h", arlm.class, arln.class, "j"});
            case NEW_MUTABLE_INSTANCE:
                return new arlx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (arlx.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
