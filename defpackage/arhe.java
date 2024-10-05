package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arhe extends aonm implements aooz {
    public static final arhe a;
    private static volatile aopf k;
    public avgg b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public aqyg f;
    public aqyg g;
    public apxf h;
    private int l;
    private aota m;
    private byte n = 2;
    public aomf i = aomf.b;
    public aony j = emptyProtobufList();

    static {
        arhe arheVar = new arhe();
        a = arheVar;
        aonm.registerDefaultInstance(arhe.class, arheVar);
    }

    private arhe() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0003\u0010\n\u0000\u0001\b\u0003ᐉ\u0000\u0004ᐉ\u0001\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\nᐉ\u0007\u000bည\b\u000f\u001b\u0010ᐉ\u0002", new Object[]{"l", "b", "c", "e", "f", "g", "h", "m", "i", "j", asus.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new arhe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (arhe.class) {
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
