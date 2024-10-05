package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoxw extends aonm implements aooz {
    public static final aoxw a;
    private static volatile aopf h;
    public int b;
    public aoxx c;
    public aoxv d;
    public aowu e;
    public aoyq f;
    private aoyq i;
    private aota j;
    private aoxz k;
    private byte l = 2;
    public aomf g = aomf.b;

    static {
        aoxw aoxwVar = new aoxw();
        a = aoxwVar;
        aonm.registerDefaultInstance(aoxw.class, aoxwVar);
    }

    private aoxw() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0006\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0005ᐉ\u0007\u0006ည\b\u0007ᐉ\u0002\bᐉ\u0004\nᐉ\t", new Object[]{"b", "c", "i", "e", "j", "g", "d", "f", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new aoxw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aoxw.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
