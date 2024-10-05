package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auru extends aonm implements aooz {
    public static final auru a;
    private static volatile aopf h;
    public int b;
    public int c;
    public aqyg d;
    public avgg e;
    public apxf f;
    private apxf i;
    private aota j;
    private byte k = 2;
    public aomf g = aomf.b;

    static {
        auru auruVar = new auru();
        a = auruVar;
        aonm.registerDefaultInstance(auru.class, auruVar);
    }

    private auru() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0005\u0001င\u0001\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0003\u0007ᐉ\u0006\bည\u0007", new Object[]{"b", "c", "d", "f", "i", "e", "j", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new auru();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (auru.class) {
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
