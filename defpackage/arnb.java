package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arnb extends aonm implements aooz {
    public static final arnb a;
    private static volatile aopf l;
    public int b;
    public armz c;
    public armz d;
    public arng e;
    public arnc f;
    public armu g;
    public arnf i;
    public armt j;
    private byte m = 2;
    public String h = "";
    public aony k = emptyProtobufList();

    static {
        arnb arnbVar = new arnb();
        a = arnbVar;
        aonm.registerDefaultInstance(arnb.class, arnbVar);
    }

    private arnb() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0001\u0002\u0001ဉ\u0000\u0003ဉ\u0002\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ဉ\u0007\bဉ\u0001\tᐉ\b\u000bဈ\u0006\f\u001b", new Object[]{"b", "c", "e", "f", "g", "i", "d", "j", "h", "k", arms.class});
            case NEW_MUTABLE_INSTANCE:
                return new arnb();
            case NEW_BUILDER:
                return new aone((float[]) null, (char[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (arnb.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
