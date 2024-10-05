package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqsw extends aonm implements aooz {
    public static final aqsw a;
    private static volatile aopf i;
    public int b;
    public aqyg d;
    public aony e;
    public apxf f;
    public aota g;
    public aomf h;
    private aqyg j;
    private byte k = 2;
    public String c = "";

    static {
        aqsw aqswVar = new aqsw();
        a = aqswVar;
        aonm.registerDefaultInstance(aqsw.class, aqswVar);
    }

    private aqsw() {
        emptyProtobufList();
        this.e = aonm.emptyProtobufList();
        this.h = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0004\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0005\bည\u0006\t\u001a", new Object[]{"b", "c", "d", "j", "f", "g", "h", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aqsw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aqsw.class) {
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
