package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auhf extends aonm implements aooz {
    public static final auhf a;
    private static volatile aopf j;
    public int b;
    public augz c;
    public augm d;
    public aulq f;
    public aoxy g;
    private aota k;
    private aulq l;
    private byte m = 2;
    public aony e = emptyProtobufList();
    public String h = "";
    public aomf i = aomf.b;

    static {
        auhf auhfVar = new auhf();
        a = auhfVar;
        aonm.registerDefaultInstance(auhf.class, auhfVar);
    }

    private auhf() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003\u001b\u0004ᐉ\u0002\u0005ᐉ\u0005\u0006ည\u0006\u0007ᐉ\u0003\bᐉ\u0007\tဈ\u0004", new Object[]{"b", "c", "d", "e", augt.class, "f", "k", "i", "g", "l", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new auhf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (auhf.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
