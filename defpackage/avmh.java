package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avmh extends aonm implements aooz {
    public static final avmh a;
    private static volatile aopf d;
    public int b;
    public avmg c;
    private byte e = 2;

    static {
        avmh avmhVar = new avmh();
        a = avmhVar;
        aonm.registerDefaultInstance(avmh.class, avmhVar);
    }

    private avmh() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue4f7ⰻ\ue4f7ⰻ\u0001\u0000\u0000\u0001\ue4f7ⰻᐉ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new avmh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (avmh.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
