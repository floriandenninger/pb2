package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class askb extends aonm implements aooz {
    public static final askb a;
    private static volatile aopf l;
    public int b;
    public aska c;
    public askc d;
    public apzy e;
    public aski f;
    public askh g;
    public auwf h;
    public aqrf i;
    public aulg j;
    public aptj k;
    private byte m = 2;

    static {
        askb askbVar = new askb();
        a = askbVar;
        aonm.registerDefaultInstance(askb.class, askbVar);
    }

    private askb() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\ueb5dᵆ\uf152拄\t\u0000\u0000\t\ueb5dᵆᐉ\u0000\ue1e1⩩ᐉ\u0001履⭎ᐉ\b\uf649㊈ᐉ\u0002\uf492䤳ᐉ\u0006\ue29d去ᐉ\u0003\ue61d姑ᐉ\u0007\ue2f4廾ᐉ\u0004\uf152拄ᐉ\u0005", new Object[]{"b", "c", "d", "k", "e", "i", "f", "j", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new askb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (askb.class) {
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
