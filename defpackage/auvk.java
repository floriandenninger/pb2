package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auvk extends aonm implements aooz {
    public static final auvk a;
    private static volatile aopf h;
    public int b;
    public boolean c;
    public aqyg d;
    public auvm e;
    public auvl f;
    private aota i;
    private byte j = 2;
    public aomf g = aomf.b;

    static {
        auvk auvkVar = new auvk();
        a = auvkVar;
        aonm.registerDefaultInstance(auvk.class, auvkVar);
    }

    private auvk() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ည\u0005", new Object[]{"b", "c", "d", "e", "f", "i", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new auvk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (auvk.class) {
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
