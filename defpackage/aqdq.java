package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqdq extends aonm implements aooz {
    public static final aqdq a;
    private static volatile aopf b;
    private int c;
    private aulq d;
    private aulq e;
    private aulq f;
    private aulq g;
    private aulq h;
    private apxf i;
    private aqyg j;
    private aqyg k;
    private aqyg l;
    private apxf m;
    private aqyg n;
    private aota o;
    private aulq p;
    private byte q = 2;

    static {
        aqdq aqdqVar = new aqdq();
        a = aqdqVar;
        aonm.registerDefaultInstance(aqdq.class, aqdqVar);
    }

    private aqdq() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\b\u001a\r\u0000\u0000\r\bᐉ\u0007\tᐉ\b\nᐉ\u0001\rᐉ\t\u000eᐉ\u000f\u0011ᐉ\u000b\u0013ᐉ\u0003\u0014ᐉ\u0004\u0015ᐉ\f\u0016ᐉ\u0005\u0017ᐉ\n\u0018ᐉ\r\u001aᐉ\u0006", new Object[]{"c", "i", "j", "d", "k", "p", "m", "e", "f", "n", "g", "l", "o", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aqdq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqdq.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
