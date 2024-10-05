package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avaz extends aonm implements aooz {
    public static final avaz a;
    private static volatile aopf k;
    public int b;
    public Object d;
    public aqyg e;
    public apxf f;
    public avbb g;
    public int i;
    public int j;
    private aota l;
    public int c = 0;
    private byte m = 2;
    public aomf h = aomf.b;

    static {
        avaz avazVar = new avaz();
        a = avazVar;
        aonm.registerDefaultInstance(avaz.class, avazVar);
    }

    private avaz() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\r\t\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐼ\u0000\u0003ᐉ\u0004\u0004ᐉ\u0005\u0007ည\u0006\bᐉ\u0007\u000bဌ\b\fဌ\t\rᐼ\u0000", new Object[]{"d", "c", "b", "e", arfs.class, "f", "g", "h", "l", "i", auye.l, "j", auye.m, avgg.class});
            case NEW_MUTABLE_INSTANCE:
                return new avaz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (avaz.class) {
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
