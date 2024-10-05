package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auwd extends aonh implements aoni {
    public static final auwd a;
    private static volatile aopf i;
    public int b;
    public apxf e;
    public boolean h;
    private aota j;
    private byte k = 2;
    public aony c = emptyProtobufList();
    public String d = "";
    public String f = "";
    public aomf g = aomf.b;

    static {
        auwd auwdVar = new auwd();
        a = auwdVar;
        aonm.registerDefaultInstance(auwd.class, auwdVar);
    }

    private auwd() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0003\u0001Л\u0002ဈ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0003\u0005ည\u0004\u0006ဈ\u0002\bဇ\u0005", new Object[]{"b", "c", aulq.class, "d", "e", "j", "g", "f", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new auwd();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (auwd.class) {
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
