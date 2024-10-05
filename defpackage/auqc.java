package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auqc extends aonm implements aooz {
    public static final auqc a;
    private static volatile aopf h;
    public int b;
    public boolean f;
    public apxf g;
    private aota i;
    private byte j = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        auqc auqcVar = new auqc();
        a = auqcVar;
        aonm.registerDefaultInstance(auqc.class, auqcVar);
    }

    private auqc() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဇ\u0003\u0004ᐉ\u0004\u0005ဈ\u0001\u0006ᐉ\u0005", new Object[]{"b", "c", "e", "f", "g", "d", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new auqc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (auqc.class) {
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
