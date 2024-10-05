package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atgf extends aonm implements aooz {
    public static final atgf a;
    private static volatile aopf i;
    public int b;
    public aqyg c;
    public atgd d;
    public atgj e;
    public apxf f;
    private atgd j;
    private apxf k;
    private byte l = 2;
    public aony g = emptyProtobufList();
    public String h = "";

    static {
        atgf atgfVar = new atgf();
        a = atgfVar;
        aonm.registerDefaultInstance(atgf.class, atgfVar);
    }

    private atgf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006Л\u0007ᐉ\u0005\bဈ\u0006", new Object[]{"b", "c", "d", "j", "e", "f", "g", aulq.class, "k", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new atgf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (atgf.class) {
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
