package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ared extends aonm implements aooz {
    public static final ared a;
    private static volatile aopf k;
    public int b;
    public aree c;
    public boolean d;
    public arfs e;
    public aqyg f;
    public apxf g;
    public apxf h;
    public aott i;
    private aota l;
    private byte m = 2;
    public aomf j = aomf.b;

    static {
        ared aredVar = new ared();
        a = aredVar;
        aonm.registerDefaultInstance(ared.class, aredVar);
    }

    private ared() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0005\u0001ဉ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ဉ\u0006\bᐉ\u0007\tည\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "l", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new ared();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (ared.class) {
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
