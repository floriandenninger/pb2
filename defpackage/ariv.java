package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ariv extends aonm implements aooz {
    public static final ariv a;
    private static volatile aopf d;
    public arnd b;
    private int e;
    private apxf f;
    private byte g = 2;
    public aony c = emptyProtobufList();

    static {
        ariv arivVar = new ariv();
        a = arivVar;
        aonm.registerDefaultInstance(ariv.class, arivVar);
    }

    private ariv() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"e", "b", "c", aulq.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new ariv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ariv.class) {
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
